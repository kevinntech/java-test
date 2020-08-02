package me.whiteship.inflearnjavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ☆")
    void create_new_study(){
        Study study = new Study();
        assertNotNull(study);   // study 인스턴스가 null이 아닌지 검증
        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태 값이 DRAFT여야 한다");
        System.out.println("create");
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