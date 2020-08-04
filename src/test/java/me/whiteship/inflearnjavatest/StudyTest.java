package me.whiteship.inflearnjavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ☆")
    void create_new_study(){
        String test_env = System.getenv("TEST_ENV");
        System.out.println(test_env);

        //assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("local");
            Study actual = new Study(100);
            assertThat(actual.getLimit()).isGreaterThan(0);
        }); // 조건을 만족하는 경우 테스트 실행

        assumingThat("keesun".equalsIgnoreCase(test_env), () -> {
            System.out.println("keesun");
            Study actual = new Study(10);
            assertThat(actual.getLimit()).isGreaterThan(0);
        }); // 조건을 만족하는 경우 테스트 실행

    }

    // @EnabledOnJre({JRE.JAVA_11, JRE.JAVA_9, JRE.JAVA_10, JRE.JAVA_11})
    // @EnabledIfEnvironmentVariable(named = "TEST_ENV" , matches = "LOCAL")
    /*
    @Test
    @DisplayName("스터디 만들기 ☆")
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void create_new_study2() {
        String test_env = System.getenv("TEST_ENV");
        System.out.println("local");
        Study actual = new Study(100);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @Test
    @DisplayName("스터디 만들기 ★")
    @DisabledOnOs(OS.MAC)
    void create_new_study_again2(){
        System.out.println("create1");
    }
    */

    @Test
    @DisplayName("스터디 만들기 ★")
    void create_new_study_again(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }
}