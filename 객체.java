class 생성

class Computer{
  boolean power;
  String scrinecolor;
  int bootcount;
  
  void power() {power = !power;}
  void bootcount() { bootcount++;} 	
}


객체 생성

  클래스 Computer와 그 변수, 메서드를 미리 생성해둔 다음.

  Computer A; 
  A = new Computer();
  A.power = true;

  Computer A; 로 클래스 Computer의 주소를 복사해서 사용하는 참조변수 A를 생성하고
  A = new Computer(); 로 초기화
  A.power = true; 전원 상태를 true로 변경.(power 변수, power메서드 동시 사용)


객체 배열 == 참조변수의 배열

  Computer[] comArr = new com[3]; index 3인 참조변수 배열 
  + 참조변수 배열을 만들었다고 해서 객체를 생성한 것은 아니다.
    생성된 참조변수 배열의 메모리 주소에 미리 만들어둔 클래스 Computer의 객체 주소를 따로 생성해 줘야한다.

객체 배열 == 참조변수의 배열
참조변수의 배열 !== 객체 배열

객체배열이 참조변수의 배열이라고 해도, 참조변수의 배열이 객체 배열인 것은 아니다. 혼동하지 말 것. 