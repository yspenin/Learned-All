변수의 초기화
  LV(지역변수) : 반드시 수동 초기화 해야함.
  IV,CV(멤버변수) : 자동 초기화된다.
    - 자동 초기화 : 기본값 0

명시적 초기화(=)
  간단한 초기화는 대입연산자(=) 사용


복잡한 초기화
   초기화 블럭
      - 인스턴스 초기화 블럭 : {}
      - 클래스 초기화 블럭 : static {}

   생성자(일반적인 iv 초기화)
      - class(String a, String b, int a){}

멤버변수의 초기화
  CV 초기화 시점 : 처음 로딩(메모리에 올리기)될 때 한 번만 초기화.
  IV 초기화 시점 : 인스턴스 생성될 때마다 매번 초기화.

연산 실행 순서
  1. CV 초기화 > IV 초기화
  2. 자동 초기화 > 복잡한 초기화
  ex) CV 초기화(자동초기화 > 명시적 초기화(=사용) > 복잡한 초기화({}블럭, 생성자 사용)  > IV 초기화( 자동 초기화> 명시적 초기화(=사용) > 복잡한 초기화({}블럭, 생성자)