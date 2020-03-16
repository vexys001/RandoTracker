# Iteration 1 Plan

HANDLED CUs: CU01, CU04, C06

[Use cases](../UseCases/use_cases.md)

- [Iteration 1 Plan](#iteration-1-plan)
  - [MDD](#mdd)
  - [CU01 Load an Item List](#cu01-load-an-item-list)
    - [DSS](#dss)
    - [Contracts](#contracts)
    - [RDCU](#rdcu)
  - [CU04 Remove an Item of the Button List](#cu04-remove-an-item-of-the-button-list)
    - [DSS](#dss-1)
    - [Contracts](#contracts-1)
    - [RDCU](#rdcu-1)
  - [CU06 Reset the Button List](#cu06-reset-the-button-list)
  - [Return to README](#return-to-readme)

## MDD 

MDD

![MDD](https://www.plantuml.com/plantuml/png/0/TLDTI-j047tVNp5KKBWWD5ulLq89Qki5mRvSqITVjicqNTpibjc9MCJ_xko6viEFFZJ9p3bppfvXBmDhugQsAZmRjzEaQmYyjoZ_PCfFdGhNkh6yzewThX4UaIhjz00nbnPvUyz8w7c_mtzIc7lh2OvMja5bSSt07iXijWoL8IpPUAUsfaB0UiTxgB5U8GLrqe-rnc6S1fvuwvLYms9nkLWeLLeT0Zm499ZDftyAU7i_59Ve6YbclwMeG7wiLo5l7-bxrJ1x9wNsHNNCMyRwpWIExEp0Db8CaCCLaTx7xYp22X1QpugCim8I9MMKfoJTHhvzMJQ4hiGunJZ63LAlUPqyfBbHz6tiS2pQOeknuROOKxY0OqWs-YmYzUQLIPViwH1ArrtuigdHfVEU7yuheJ_tzWNReIRP14vFqoDbd4C1zsXbbLZ9mPxSrVH2ZHK7b6vCfCdYWk2pJAcqmw-Z1v0-eY4kyNAO3MVzADvjDehF2JLtdAwLuBR53oHp-8yxmY3M8sNwzpi_loR3NUImbFkn6Kaap5StckJEwPT1WEeINIKNy0C0 "MDD")


## CU01 Load an Item List

### DSS

![DSS - Load an ItemList](https://www.plantuml.com/plantuml/png/0/JP3DQWCn38JlVWgHKmhT5zX3ISgs4DZsq93shDhgOkALNLdkpzjNcnBOYp3wPaQ3TrLHjCq9N3r7BYWuGzNVH3Ob-WMjo40Vs98-PjPdd0bUIG8ohXJlwC-JvCR1vvG5L92h8M9TNw3FHkpfYMh5YVOfJWpUD2HEezhruNY43iQC0P3Xe3IFiQfpwDLID_sfacm0ApHdaHfzBCXgO5zAYXurPhvm1ESQT7Vsw24NuYNpBNB8tziRXz0PQeQ6xDji3U3XfrXn4lWNhTp9dDScsoQfXzFBkCwuGgZuHU4MxfjgvijcyL9mRaSSx4__0000 "DSS - Load an ItemList")


### Contracts

1.  **Contract** : openLoadWindow()
    - **Reference**: CU01
    - **PreCondition**: User selected the Load list option in the menu.
    - **PostConditions**: N/A

2.  **Contract** : loadItemList(url: URL)
    - **Reference**: CU01
    - **PreCondition**: 
      - User has selected a properly formatted XML file from the File Explorer Window
    - **PostConditions**: 
      - An instance of the ItemList is created. 
      - An instance of an Item is created for each element extracted.
      - Each Item created is associated to the ItemList.
      - An instance of the ButtonList is created. 
      - An instance of an ItemButton is created for each element extracted.
      - Each ItemButton created is associated to the ButtonList.

### RDCU

1. RDCU of openLoadWindow(CU01)

![RDCU of openLoadWindow(CU01)](https://www.plantuml.com/plantuml/png/0/NL1DImCn4BtdLmmzwS6YrmMbibKGF8dLIozZCai7ivEOJ5ZzzywkXM8lOSBxcZURgbYqZT7LJvQC1KUe-XF9tiB-30aqO8iw9571aU2DIa11fwocUDdsEqW3f4pod32yiuGqNVIxwvjBvyn1sND6KLXXphsPb1GZbUuqhW0he7VEILA2I8FEZkWxE97sydeW-6S1_c-ie0RTvnpPetAIzLxWIM7Y6A7GLwEgWF38jYvzvvYAQQTbJq09HauVYYpsWLRYqiRY8IJVHfBPI0_0kdPNT-YXE-zgFT4VeLb_kn3ck8TZsapPa0Gxx2y0 "RDCU of openLoadWindow(CU01)")

2. RDCU of loadItemList(CU01)

![RDCU of loadItemList(CU01)](https://www.plantuml.com/plantuml/png/0/TPFDJkim48NtVeeHgnJHwhArH8Ne1UbAY0KIx2VE52ocTkHCTE7j6UUt3MKJMRRddE-S9BUDO9BsmARvyA76X0Tev8j9dycxnKb5UsnPzZ58m0F1AwKA0nhneXFFVtSl4FV04Qj_GeT7tqYnU_bplJ96vyKxNsCGkC2wtgb4YioKxBoy06m0tUbbcsNkFoMXazXVOJ8cH25Tx2KxehCmovZr5XrOQ1F33SIQmeDdkl-iEIPAnMenp6H13oc9GRVUQX0Bh9uqcMvoeemnfLBfPIWx7dQ8dazDF2jX8bGrmxJUUeRBIpNomv22ZlCRb-zHaHdiKwmeRvvrwvqCnrZ3Gqn0wDuxnUmexzJ5M73C69uLOwOO24Rt_7vjzn64jok8phM9WgF6-g0mIyt7-5zVG5kptXw4vsmRhBhleSWRAqEXWeoyJ7JNYiGmDLWk6Ypv5BqS6YodCKqmQumvHWWxzNksodwmBxJyfT5EwaobvGnMvkZbCTXGQwz_3DK3hNvgdNGv21x7p7NsSaM_ULofkTMr_hJV "RDCU of loadItemList(CU01)")




## CU04 Remove an Item of the Button List

### DSS 

### Contracts

### RDCU

## CU06 Reset the Button List

## [Return to README](../../README.md)