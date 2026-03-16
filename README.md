# Blackjack-step3
블랙잭에서 상태가 필요한 것은 `Player` 의 `Hand` 입니다. 즉 손 카드 상태에 따라 상태가 바뀌고 행동이 바뀌는 것을 구현해야합니다.

또한 실제 동작을 구현해야 하는 것은 시작 `Started` , 진행 `Running` , 종료 `Finished` 로 구현될 것입니다.

```
Player
 └─ State (interface)
      ├─ Started (초기 상태)
      ├─ Hit (히트 가능 상태)
      └─ Finished (종료 상태)
		      ├─ Stay
		      ├─ Bust
		      └─ BlackJack
```

상태 전이도 구현해봅시다.

```
Started → Hit

Started → BlackJack (처음부터 블랙잭)
Hit → Hit (히트 후 히트 가능 상태)
Hit → Stay (히트 후 멈추기)
Hit → Bust (히트 후 버스트)
```

이제 각 상태들이 필요한 행동을 정의해봅시다.
```markdown
Started - Hand | draw, stay
Hit - Hand | draw, stay
Finished - Hand | Rate
```