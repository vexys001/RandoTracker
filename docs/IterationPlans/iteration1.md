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
  - [CU06 Reset the Button List](#cu06-reset-the-button-list)
  - [Return to README](#return-to-readme)

## MDD 

![MDD](https://www.plantuml.com/plantuml/png/0/TLDDI-H04BtthoX6S651cBZAIf2WphWWx5mKFNdfIMfc6ZlTGtL576J_-rPto9U3EUIZwhrNLQ_IDu4rSLDR5TwCsslIDGG-M9GxcV9BfiADRYnll6EdQuGNf4exFK8i94NUFZ4IUZxiyOy45jvwWfErRL1Pt32m1pBR7KDb24istgcTgH2mtlC1QgpNI47z66IjSHZLm1Fll59iM5fSBPTAbLQ70Cy12QuNyyi2FlzrmHMwHeBPBmaga8lrEkJj8tsl6sRl9DI-g9xvm5Z_DO4ZE-lOHe81ShWbqeUOlOwm0eGsi2BZl814IHxboKctbMzVbWsXAp6g6CUuHHfgtgKUacui-ZdjS5gqnHRJXjjWTE4AJY6rCNWHgVSVJBfaJvqfVNRfowP6b-QzwEOLqz-6zWNResRP3CxEqYDvdCCJMbaaLZBMgxkTNwbflH6X5ycXY6iBWiyofT86ZuN7cC6X5cXRP6BAMaTYtrOVIGXZGQYv8ttBwN-6V4fGVMBSpQJ28-u9WqmRAVFVHnC8vUTilBmSLdAWjfCI2NFSIm6Qv9Zgzv7hwWPT9MVsFm00 "MDD")


## CU01 Load an Item List

### DSS

![DSS - Load an ItemList](https://www.plantuml.com/plantuml/png/0/JP3DQWCn38JlVWgHKmhT5zX3ISgs4DZsq93shDhgOkALNLdkpzjNcnBOYp3wPaQ3TrLHjCq9N3r7BYWuGzNVH3Ob-WMjo40Vs98-PjPdd0bUIG8ohXJlwC-JvCR1vvG5L92h8M9TNw3FHkpfYMh5YVOfJWpUD2HEezhruNY43iQC0P3Xe3IFiQfpwDLID_sfacm0ApHdaHfzBCXgO5zAYXurPhvm1ESQT7Vsw24NuYNpBNB8tziRXz0PQeQ6xDji3U3XfrXn4lWNhTp9dDScsoQfXzFBkCwuGgZuHU4MxfjgvijcyL9mRaSSx4__0000 "DSS - Load an ItemList")

### Contracts

1.  **Contract** : openLoadWindow()
    - **Reference**: CU01
    - **PreCondition**: User selected the Load list option in the menu.
    - **PostConditions**: N/A

2.  **Contract** : loadItemList()
    - **Reference**: CU01
    - **PreCondition**: 
      - User has selected a properly formatted XML file from the Document Explorer Window
    - **PostConditions**: 
      - An instance of the ItemList is created. 
      - An instance of an Item is created for each element extracted.
      - Each Item created is associated to the ItemList.
      - An instance of the ButtonList is created. 
      - An instance of an ItemButton is created for each element extracted.
      - Each ItemButton created is associated to the ButtonList.

### RDCU

## CU04 Remove an Item of the Button List

## CU06 Reset the Button List

## [Return to README](../../README.md)