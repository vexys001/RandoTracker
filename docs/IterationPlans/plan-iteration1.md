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

![MDD](https://www.plantuml.com/plantuml/png/0/TLDBQzmm4BxhLmnRQA0GkcvQ6inYakusKEXU6jfJBx8zkoiYIsOqBZ6X_xqZcVKZQNomhPdlnKYw2Qo9kyQgy61Sgqat4BYtA6yorRDEZGVTMJvunqut2B-GQktq3B6L5dbxpqZekM_nJWfRRpt1cz9sg2mU6DW3cUE9eJQ45HllrCdK2DYqt4E3JOaKrCKaQut3g0QU-EILOiCISR_RALLP7GBy34YmsQu_5V3qzrpSe-kac5r9KO4yhCkG3v-qBZjcxwGq_AYH-Osn-Mu2HtPsPXif1iZXbaZtiRk9i0A4Dh4YuqC1YP9cbAT9kgEiVLLrXAx2g68Sun5fyloICYJTQFgqJBWq7R35Cl1GZ5EuXhUGOWmYptEyaYGsthVaIrqQQxZFuM2zviaasdzzPD8LUpeFTkpkVDKrwDBCFfwjPUCU9cl1ZgXLjeBBo_H9-vH30VTevJXWBP5-kzlrjLewpYYZJAJ9vWV1PvbIwHoyb9v1fZ7FSOcNmsQkzQhvU3gY-PPGyyWPMmbk1_pCCeSVs186YHufwy__o_DkDT_F7FPonuuBYuHvcKQJt5lzPpP0TOEkbaly3m00 "MDD")


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

![DSS - Load an ItemList](https://www.plantuml.com/plantuml/png/0/JP2nJWCn343tV8NLgGmTM3kW5bL8I8M1gkm-npsYopb7OW_zUtpNWLkIAE_fESgXALQrCKDeGv89AuxGz9xPrvfeHYjouXjQrhSY-eaZmpVNY88heqCQ-bfC8fLSAcX5QOvOT3s1Vus5-8DRmvwFEVK2v0xNe4bz-kboWHsS2qP0WNVbyPoQXe2aNjtihuth1h211KzgeZIXg8FZDEL4gAd8mX52CDYz-64Fv6YOOw-cMcJxs9u2miuDS-EBen57q1-6GcHrVYQK6tIB2jqTdbT1co8gFpBp0xVhrlyrN1SlXd1WYVwdVm00 "DSS - Load an ItemList")


### Contracts

1. **Contract** : clickItemButton(Button)
    - **Reference**: CU04
    - **PreCondition**: User has a button list already available.
    - **PostConditions**:
      - The variable occurence of Button will be reduced by 1.
      - If the variable occurence is equal to 0, delete instance of button.
      - If the variable occurence is equal to 0, delete association between the button and its ButtonList.
  
2. **Contract** : updateButonList()
    - **Reference**: CU04
    - **PreCondition**: User has a button list already available.
    - **PostConditions**:
      - The variable probability of each ItemButton of the ButtonList is updated.

### RDCU

## CU06 Reset the Button List

## [Return to README](../../README.md)