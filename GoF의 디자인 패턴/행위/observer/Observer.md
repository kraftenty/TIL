# Observer 패턴 (옵저버) 
* 옵저버(관찰자)들이 관찰하고 있는 대상자의 상태가 변화가 있을 때마다 대상자는 직접 목록의 각 관찰자들에게 통지하고, 관찰자들은 알림을 받아 조치를 취하는 패턴이다.
* 다른 패턴들과 다르게 일대다(One-to-Many) 의존성을 가진다.
* 발행자(Subject)와 구독자(Observer)로 이해할 수 있다.

### 구조
1. Subject: 관찰 대상자
1. Observer: 관찰자