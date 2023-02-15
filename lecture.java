/*
[Day21]
- buffer
: 임시저장공간
: 용량이 찰때까지 혹은 강제로 비워줄때까지 나가지 않음

-Socket
: 전화기와 같은 역할

- try(){}
: ()안에 내용들은 try 블럭이 끝나면 자동으로 소멸 ex.파이썬의 with 구문
: finally에서 close()를 명시적으로 호출할 필요x

- BufferedReader
: 수신용 -> getInputStream(): 클라이언트가 서버한테 보내는 역할
: ex. 핸드폰 위쪽(소리 나오는 곳)

- PrintWriter -> getOutputStream()
: ex. 핸드폰 아래쪽(수신자의 소리를 담는 곳)

- out.println()
: System.out.println()과 다르게 화면에 출력하는 것이 접속했던 목표에게 출력

- client
: client가 접속할 대상과 port번호가 같아야함

[Day22]
- 그냥 소켓은 클라이언트용, 서버소켓은 서버용
- 버퍼 두개 사용 1)송신용: PrintWriter 2)수신용: BufferedReader
- 클라이언트 소캣이
- 네트워크는 언어에 종속되지 않고 서버화면은 파이썬, 클라이언트화면은 자바도 가능

- (autoFlush) true 역할
: 버퍼를 자동으로 비워주는 역할을 함 (원래는 버퍼를 직접 비워줘야 함)

-Stream
: 불필요한 for문을 사용하지 않을 수 있고, 람다식을 활용할 수 있어서 코드를 직관적이게 처리가능

[Day33]
- Compositon vs Aggregation (보는 관점에 따라 다름)
-> Compositon: 전체와 부분이 강력한 연관 관계o, 전체와 부분이 같은 생명주기o
-> Aggregation: 전체와 부분의 연관관계를 맺지만 동일한 생명주기x

- 추상클래스와 interface 차이
1) 추상클래스는 단일 상속, interface는 다중상속
 */

