package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TryCountTest {
    TryCount tryCount = null;

    @BeforeEach
    void setUp() {
        tryCount = new TryCount();
    }

    @Test
    void create() {
        assertThat(new TryCount("3")).isEqualTo(new TryCount("3"));
    }

    @Test
    void 자연수가아닐때_익셉션이발생하는지_테스트() {
        assertThrows(IllegalArgumentException.class, () -> {
            tryCount.invalidTryNumberException("-2");
        });
    }

    @Test
    void 문자열을입력했을때_익셉션이발생하는지_테스트(){
        assertThrows(IllegalArgumentException.class, () -> {
            tryCount.invalidTryNumberException("sdjflkdjf");
        });
    }

    @Test
    void 자연수가아닐때_익셉션_로그가_제대로_출력되는지_테스트() {
        try {
            tryCount.invalidTryNumberException("-2");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    void 문자열을_입력했을때_익셉션_로그가_제대로_출력되는지_테스트() {
        try {
            tryCount.invalidTryNumberException("ㅁㄴㅇㄹ-2");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}