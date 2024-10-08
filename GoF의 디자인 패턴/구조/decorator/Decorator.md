# Decorator 패턴
* 대상 객체에 대한 기능 확장이나 변경이 필요할 때 객체의 결합을 통해 서브클래싱 대신 사용할 수 있는 유연한 구조 패턴.
* 장식자 역할. 런타임에서 추가 기능의 조합을 동적으로 생성할 수 있다.

### 구조
1. Component(인터페이스): 원본 객체와 장식된 객체 모두를 묶는 역할
1. ConcreteComponent: 원본 객체 (데코레이팅될 객체)
1. Decorator: 추상화된 장식자 클래스. 원본 객체를 합성한 wrappee 필드와 인터페이스의 구현 메서드를 가지고 있다.
1. ConcreteDecorator: Decorator 구현체. 부모 클래스가 감싸고 있는 하나의 Component를 호출하면서, 호출 전/후로 부가적인 로직을 추가(장식)할 수 있다.