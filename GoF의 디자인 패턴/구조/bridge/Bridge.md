# Bridge 패턴
### 기능과 구현의 분리
* 기능 계층과 구현 계층의 분리로 시스템의 확장성과 유지보수성을 높이는 패턴

# Bridge 패턴의 구성 요소 (기능 계층 ---- 구현 계층)
> 기능 계층  
> 1. Abstraction: 기능 계층의 최상위 클래스. 
> 1. RefinedAbstraction: Abstraction의 기본적인 기능을 가지고, 새로운 기능을 추가한 클래스.
  
> 구현 계층  
> 1. Implementor: abstract 구현 계층의 인터페이스
> 1. ConcreateImplementor: 구현 계층의 구현체
**기능과 구현은 Bridge로 연결되어 있다**