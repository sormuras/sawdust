import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Build {

  public static void main(String... args) throws Exception {
    Bach.Default.VERBOSE = true;
    new Build().build();
  }

  Path DEPS = Paths.get("deps");
  Path MAIN = Paths.get("target", "bach", "main");
  Path TEST = Paths.get("target", "bach", "test");

  Path moduleAlphaMain = Paths.get("modules/foo.bar.alpha/src/main/java");
  Path moduleAlphaTest = Paths.get("modules/foo.bar.alpha/src/test/java");
  Path moduleTestUserView = Paths.get("modules/test.user.view/src/test/java");

  void build() throws Exception {
    Bach.Basics.treeDelete(Paths.get("target", "bach"));
    compileMain();
    run();
    compileTest();
    test();
  }

  void compileMain() {
    System.out.println("\n compile main modules... \n");
    Bach.JdkTool.Javac javac = new Bach.JdkTool.Javac();
    javac.destination = MAIN;
    javac.modulePath = List.of(DEPS);
    javac.moduleSourcePath = List.of(moduleAlphaMain);
    javac.run();
  }

  void run() {
    System.out.println("\n run main... \n");
    Bach.JdkTool.Java java = new Bach.JdkTool.Java();
    java.modulePath = List.of(MAIN, DEPS);
    java.module = "foo.bar.alpha/foo.bar.alpha.Main";
    java.run();
  }

  void compileTest() {
    System.out.println("\n compile test modules... \n");
    List<Path> tests = List.of(moduleAlphaTest, moduleTestUserView);
    List<Path> mains = List.of(moduleAlphaMain);
    Bach.JdkTool.Javac javac = new Bach.JdkTool.Javac();
    javac.destination = TEST;
    javac.modulePath = List.of(DEPS);
    javac.moduleSourcePath = tests;
    javac.patchModule = Bach.Basics.getPatchMap(tests, mains);
    javac.run();
  }

  void test() {
    System.out.println("\n launch junit platform console... \n");
    Bach.JdkTool.Java java = new Bach.JdkTool.Java();
    java.modulePath = List.of(TEST, DEPS);
    java.addModules = List.of("ALL-MODULE-PATH");
    java.module = "org.junit.platform.console";
    java.args = List.of("--scan-module-path");
    java.run();
  }
}
