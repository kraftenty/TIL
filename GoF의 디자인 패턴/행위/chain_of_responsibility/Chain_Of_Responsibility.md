# Chain of Responsibility (책임 연쇄 패턴)
* 책임이란? 무언가를 처리하는 기능(클래스)
* 여러 개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
* 클라이언트의 요청에 대한 세세한 처리를 하나의 객체가 몽땅 하는 것이 아닌, 여러 개의 처리 객체들로 나누고, 이들을 사슬(chain)처럼 연결해 집합 안에서 연쇄적으로 처리하는 패턴이다.

**처리 객체:핸들러**
> 요청을 받으면 각 핸들러는 요청을 처리할 수 있는지 판단하고, 없으면 체인의 다음 핸들러로 처리에 대한 책임을 전가한다.
> 책임 연쇄: 책임을 다른 객체에 떠넘긴다.