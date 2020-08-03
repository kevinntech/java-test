package me.whiteship.inflearnjavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ☆")
    void create_new_study(){
        //Study study = new Study(-10);

        /*
        assertNotNull(study);   // study 인스턴스가 null이 아닌지 검증
        assertEquals(StudyStatus.DRAFT, study.getStatus(),
                () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태다.");
        // 람다식으로 메시지를 만들면 테스트가 실패 했을 때만 문자열 연산을 함 (람다식을 쓰면 성능 상 유리)
        // 람다식을 이용하지 않으면 문자열 연산은 테스트 성공 여부에 관계 없이 항상 진행 됨
        assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0 보다 커야 한다.");

        */

        /*
        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
                        () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태다."),
                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0 보다 커야 한다.")
        );

         */

        /*
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        assertEquals("limit은 0보다 커야 한다.", exception.getMessage());

         */

        // assertTimeoutPreemptively
        assertTimeout(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });
        // TODO ThreadLocal
    }

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