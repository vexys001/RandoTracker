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
    - [DSS](#dss-2)
    - [Contracts](#contracts-2)
    - [RDCU](#rdcu-2)
  - [Return to README](#return-to-readme)

## MDD 

![MDD](https://www.plantuml.com/plantuml/png/0/TLDBQzmm4BxhLmnRQA0GkcvQ6inYakusKEXU6jfJBx8zkoiYIsOqBZ6X_xqZcVKZQNpmO-PxUIJT1DR4NMDLU32krQGR2DnRb3kPwbcdneFkB1-yOwSRX5z8jNPwXjXAYxozPoJqtBTu9uMjjvxWJMaxL1OF3Eo1pF74K1l2YertwcHg16nQxg71faGAwcAIjSPXL0DFVF9AiM69kD_jbAgi3W5-1YJORDUV2dZwUoxkqNLIpAwag40krcN8XqVwBZjcxwGqlAYH-Osn-Mu2HtPsPXif1iZXbaZtiRk9i0A4Dh4YuqC1YP9cbAT9kgDy-whg25s5KSKunYFIvFabPKYwqVHfcN1fEc2B17dlobWAINBv2mCipkKQta8ADiW-J_PAjYJVaYzrQQpXFeU3zNfc4WDzVMJI5NiwZthixdpLDUZI53-UhMKf7oPhmOweLRQ2oylqI2kNGm7tQ6M3O2sHVhlRzRLQEiueeqoaoNO8WiyofTBEU2azWqo3d-CIBuVDNEjLyt6_HFCjeUQHCxOIt0xucMKEFx0b318zKjQV_vVdtMg-dZdivTGT5nO9ypAD9Zd9-iziWEe6NIt7-Xy0 "MDD")


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
      - for each element extracted:
        - An instance of an Item is created.
        - Each Item created is associated to the ItemList.
      - An instance of the ButtonList is created. 
      - For each Item of the ItemList:
        - An instance of an ItemButton is created.
        - Each ItemButton created is associated to the ButtonList.

### RDCU

1. RDCU of openLoadWindow(CU01)

![RDCU of openLoadWindow(CU01)](https://www.plantuml.com/plantuml/png/0/NL1DImCn4BtdLmmzwS6YrmMbibKGF8dLIozZCai7ivEOJ5ZzzywkXM8lOSBxcZURgbYqZT7LJvQC1KUe-XF9tiB-30aqO8iw9571aU2DIa11fwocUDdsEqW3f4pod32yiuGqNVIxwvjBvyn1sND6KLXXphsPb1GZbUuqhW0he7VEILA2I8FEZkWxE97sydeW-6S1_c-ie0RTvnpPetAIzLxWIM7Y6A7GLwEgWF38jYvzvvYAQQTbJq09HauVYYpsWLRYqiRY8IJVHfBPI0_0kdPNT-YXE-zgFT4VeLb_kn3ck8TZsapPa0Gxx2y0 "RDCU of openLoadWindow(CU01)")

2. RDCU of loadItemList(CU01)

![RDCU of loadItemList(CU01)](https://www.plantuml.com/plantuml/png/0/TPFDJkim48NtVeeHgnJHwhArH8Ne1UbAY0KIx2VE52ocTkHCTE7j6UUt3MKJMRRddE-S9BUDO9BsmARvyA76X0Tev8j9dycxnKb5UsnPzZ58m0F1AwKA0nhneXFFVtSl4FV04Qj_GeT7tqYnU_bplJ96vyKxNsCGkC2wtgb4YioKxBoy06m0tUbbcsNkFoMXazXVOJ8cH25Tx2KxehCmovZr5XrOQ1F33SIQmeDdkl-iEIPAnMenp6H13oc9GRVUQX0Bh9uqcMvoeemnfLBfPIWx7dQ8dazDF2jX8bGrmxJUUeRBIpNomv22ZlCRb-zHaHdiKwmeRvvrwvqCnrZ3Gqn0wDuxnUmexzJ5M73C69uLOwOO24Rt_7vjzn64jok8phM9WgF6-g0mIyt7-5zVG5kptXw4vsmRhBhleSWRAqEXWeoyJ7JNYiGmDLWk6Ypv5BqS6YodCKqmQumvHWWxzNksodwmBxJyfT5EwaobvGnMvkZbCTXGQwz_3DK3hNvgdNGv21x7p7NsSaM_ULofkTMr_hJV "RDCU of loadItemList(CU01)")



## CU04 Remove an Item of the Button List

### DSS

![DSS - Remove an Item of the Button List](https://www.plantuml.com/plantuml/png/0/JP4zQyCm48Pt_OeZKpfuw9gX92Kj5DeE2Ub-ELqSOVlaIgT2_drFzc0luk1vlq3xh9Yq33sut0KPCU40MHyzsvi2LRGYHxvXwVKzYdxZmF33oQFWId55wjeKYtYAVKoW2IKROj5r0_yM5k8lpXbRFlIX5I3JS78QrDgFvpCqSE8X_Z6Wm8Vo0F46UcTuBQfHu3DaTGv9hMQpksHE6y0CnLc71WeZYXeuZ6CV23L4cJY2SmMQ5pjsG8QwcZrdRfVpoI4qfYgcEh4ln7ugZqGbrUsvpbdqS7t0iwkcERcC7fLdLfTkru5lIFUrrv8M9LmcgtTkp-Bj0_u1 "DSS - Remove an Item of the Button List")


### Contracts

1. **Contract** : clickItemButton(ItemButton: button)
    - **Reference**: CU04
    - **PreCondition**: User has a buttonList (ButtonList) already available.
    - **PostConditions**:
      - The variable occurences of button (ItemButton) is reduced by 1.
      - If the variable occurence of button is equal to 0:
        - Delete association between the button and buttonList.
        - Delete instance of button.
  
2. **Contract** : updateButonList()
    - **Reference**: CU04
    - **PreCondition**: User has a buttonList (ButtonList) already available.
    - **PostConditions**:
      - The derived variable probability of each ItemButton of buttonList is updated.

### RDCU

1. RDCU of clickItemButton(CU04)

![RDCU of clickItemButton(CU04)](https://www.plantuml.com/plantuml/png/0/TP9FQyCm3CNl-XIYf_NGiSDEXfNITB11OL3exegZjAQERHnbVxxzj6GqD5rzCC9w-hqdyAeLoj8r7jgJ2uaoDTZAjsUzixEJJiKrTLxg62HGm_ZEkQ9084vqOhSfzXXhjDxPqwjmi-v4OhWhzW-FSm15YBCkKH2SKKg5KdBqdhCPonbIYsGlnMNFsRfMpFfSzihI_wSqe_cW0WXH63tNyXkGhC7H4XPBicYkOW-i-MIsz0PVtE6eW2EtBWOWkrYMNW73m8wR-C4LFk4O-pxtZmFupTekSx1yoy7WDduglqlUXGEKNlctw7_aaQcqcEHI3QZdQeldhyHP-jvaXQl8vwGSAbGym4eh_Hi_ "RDCU of clickItemButton(CU04)")

2. RDCU of updateButonList(CU04)

![RDCU of updateButonList(CU04)](https://www.plantuml.com/plantuml/png/0/RP6nQiCm48RtUueZapEaTEYa8OIu7GeTIY7TJ_A9Y9ub8PsXVVlAQR2RqaKSqg_l-uKELQdeD0hKZn0p5HgnwfTmMqjmVqu6zZI9-XGrqiZupcMWIA11sustn_w4oUEK1r8-JfhYIwZQzQVxXor0GsXm8LDKt53EVQEK9CB5hEC6gIAvsx2TzCeonsMy9AtybpJFokDFyf8A5Y0cPHJsEZUqOl3fCtDH8BVRMq63g-HkUK3Rg5shBYbbzAaWaplZIiSPfcV6jTQjADX5P6Mt3tOHNIMl9TdkbphQcLwt21m7dBq0S6Xp-uXl "RDCU of updateButonList(CU04)")


## CU06 Reset the Button List

### DSS

![DSS - Reset the Button List](https://www.plantuml.com/plantuml/png/0/JP0nJWD134NxEOML2egzG0gKe8WAA8YWDxDciJBhMSP_XBWzNbAmZMNvVJrB_-3WXZuNIdvHMxZnJ8wV8Z6RvXLjo4a-k1SyLCCppq9lqaOstYJUEL-cLhkDkPRQ28tD0ubX-q6-kbYM9t7dIOv59wCS6Ma9YlX-Efzfe1Tn0U5JwBu3rUXH7IbnHgXt-rUNjYDswYcyqAmB6m8SbwLePcYrFywKKgVXBfOzjLLwzQswczl4D0JhmVxFf7vD4YefFFfW235ehDzMAeyf7SJ6AEWN "DSS - Reset the Button List")


### Contracts

1. **Contract** : resetButtonList()
    - **Reference**: CU06
    - **PreCondition**: User has a buttonList (ButtonList) and an itemList (ItemList) already available.
    - **PostConditions**:
      - For each button (ItemButton) of buttonlist:
        - Delete association between button and buttonList.
        - Delete instance of button
      - For each Item of itemList
        - An instance of an ItemButton is created.
        - Each ItemButton created is associated to the ButtonList.

### RDCU


## [Return to README](../../README.md)