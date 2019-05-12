# java-racingcar
자동차 경주 게임 미션 저장소

## 기능 구현 목록

---

### 자동차의 목록을 입력받기
- 자동차의 목록을 입력받는다
- 자동차 내부에서 0에서 9사이의 랜덤값을 생성한다
- 4이상의 값이 생성되면 차를 이동한다
- 입력받은 문자열을 쉼표를 기준으로 파싱한다
    - 자동차가 1개 이하이면 예외 처리
    - 중복된 자동차 이름이 있을 때 예외 처리 
    - 자동차의 이름이 5자 초과이면 예외 처리
    - 입력이 빈칸이면 예외 처리

### 게임의 진행 횟수를 입력받기
- 시도할 게임 횟수를 입력받는다
    - 숫자가 아니면 예외 처리 
    - 게임 횟수가 0이하이면 예외 처리

### 자동차 경주 게임 진행
- 시도 횟수만큼 게임을 진행한다
    - 자동차의 이동횟수만큼 거리를 출력한다 (이름 : --- )
    - 가장 긴 이름에 맞게 이름 칸 크기를 맞춘다
    - 한꺼번에 출력하지 않고 1초마다 게임 진행 결과를 출력한다

### 게임 우승자 출력 
- 게임을 완료하면 우승자를 출력한다
    - 중복 우승자를 가려낸다