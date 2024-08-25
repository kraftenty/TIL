# Command 패턴
* 하나의 명령(기능)을 객체화한 패턴
* 객체는 전달할 수 있고, 보관할 수 있음. 즉 명령을 전달하고 보관할 수 있게 됨.
* 배치 실행, undo/redo, 우선순위가 높은 명령을 먼저 실행하기 등이 가능해짐


### 구조
1. Command: 실행될 기능에 대한 인터페이스. 실행될 기능을 execute 메서드로 선언함
1. ConcreteCommand: 실제로 실행되는 기능을 구현. 
1. Invoker: 기능의 실행을 요청하는 호출자 클래스
1. Receiver: ConcreteCommand에서 execute메서드를 구현할 때 필요한 클래스