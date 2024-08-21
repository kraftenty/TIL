# Adaptor 패턴
* 한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환한다.
* 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않았거나 호환되지 않는 경우 사용

### 어댑터 패턴 구조
1. 객체 어댑터
    1. Adaptee(Service): Adaptor가 대상으로 하는 객체. 기존 시스템.
    2. Target(Client Interface): Adaptor가 구현하는 인터페이스
    3. Adapter: Client와 Adaptee(Service) 사이에서 호환성이 없는 둘을 연결시켜주는 역할.
    4. Client: 기존 시스템을 Adaptor를 통해 이용하려는 쪽. Client Interface를 통하여 Service를 이용할 수 있게 된다.

2. 클래스 어댑터
    * 클래스 상속을 이용한 어댑터 패턴.
    * Adapter가 Client Interface와 Adaptee를 동시에 상속한다.
    * 자바에서는 다중 상속 불가 문제 때문에 권장하지 않는다.