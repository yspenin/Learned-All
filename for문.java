for
	조건을 반복하는 동안 {}블럭을 반복수행
	-정해진 반복횟수를 알고 있을 때 사용

for(int a=1";a<=5;a++){
System.out.println("i can do it")
}
: i can do it 한 줄씩 5줄 출력

중첩 for
	안쪽 for문부터 차례대로 적용
for(int i=2;i<=9;i++){
	for(int j=1;j<=9;j++){
		system.out.pringln(i + j + "=" + (i * j));
	}
}
: 2 ~ 9 구구단 한 줄씩 출력