/*
[Comparable Comparator 차이]
Comparable -> compareTo(T o)
-객체를 비교할 수 있도록 만든다. (객체 비교 기준 제시)
-자기 자신과 파라미터로 들어오 객체를 비교

Comparator -> compare(T o1, o2)
-객체를 비교할 수 있도록 만든다. (객체 비교 기준 제시)
-자기 자신의 상태가 어떻던 상관없이 파라미터로 들어오는 두 객체를 비교

--> sort가 위의 정렬 방법을 기준으로
음수일 경우 : 두 원소의 위치를 교환 안함

양수일 경우 : 두 원소의 위치를 교환 함
 */