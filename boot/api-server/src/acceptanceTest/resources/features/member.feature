@api
Feature: 멤버 관련 기능

  Scenario: 새 멤버를 등록한다.
    Given 관리자 권한으로 로그인하고
    When 새로운 멤버를 동록하면
    Then 새로운 멤버가 등록된다.