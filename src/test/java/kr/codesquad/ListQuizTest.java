package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListQuizTest {
    List<Character> sampleList = new ListQuiz().getList();

    @Test
    @DisplayName("배열의 끝에 i를 추가해보기")
    public void test_plusI () {
        // TODO 1 배열에 i를 추가해보기
        assertTrue(sampleList.contains('i'));
        assertEquals('i', sampleList.get(sampleList.size() - 1));
    }

    @Test
    @DisplayName("값이 c인 배열의 인덱스 찾기")
    public void testFindValueC () {
        //TODO 2 값이 c인 배열의 인덱스 찾기
        int answer = 0;

        assertEquals(2, answer);
    }

    @Test
    @DisplayName("list의 여섯 번째 값은?")
    public void testSixthValue () {
        //TODO 3 list의 여섯 번째 값은?
        char answer = ' ';
        assertEquals('f', answer);
    }

    @Test
    @DisplayName("배열의 길이")
    public void testLength () {
        // TODO 5 배열의 길이는?
        int answer = 0;
        assertEquals(answer, sampleList.size());
    }

    @Test
    @DisplayName("배열에서 세번째 값을 삭제")
    public void testDeleteThirdValue () {
        // TODO 6 배열에서 1번 값을 삭제

        assertFalse(sampleList.contains('e'));
    }
}