# Memento Pattern
* memento: 추억, 과거의 기억
* 객체의 상태를 기억해 두었다가, 필요할 때 기억해둔 상태로 객체를 되돌린다.
* 객체의 상태 정보를 가지는 클래스를 따로 생성하여, 객체의 상태를 저장하거나 이전 상태로 복원할 수 있게 해 준다.
* 원하는 시점의 상태 복원이 가능하다.

### 구조
* Originator: 객체의 상태를 생성하고 이를 Memento 객체에 저장하는 역할
* Memento: Originator의 상태를 저장하고 복원할 수 있는 역할
* Caretaker: Memento를 저장하고 관리하는 객체. Originator의 상태를 복원할 때 이용.