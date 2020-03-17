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

![DSS - Remove an Item of the Button List](https://www.plantuml.com/plantuml/png/0/JP4zQyCm48Pt_OeZKpfuw9gX92Kj5DeE2Ub-ELqSOVlaIgT2_drFzc0luk1vlq3xh9Yq33sut0KPCU40MHyzsvi2LRGYHxvXwVKzYdxZmF33oQFWId55wjeKYtYAVKoW2IKROj5r0_yM5k8lpXbRFlIX5I3JS78QrDgFvpCqSE8X_Z6Wm8Vo0F46UcTuBQfHu3DaTGv9hMQpksHE6y0CnLc71WeZYXeuZ6CV23L4cJY2SmMQ5pjsG8QwcZrdRfVpoI4qfYgcEh4ln7ugZqGbrUsvpbdqS7t0iwkcERcC7fLdLfTkru5lIFUrrv8M9LmcgtTkp-Bj0_u1 "DSS - Remove an Item of the Button List")


### Contracts

1. **Contract** : clickItemButton(ItemButton: button)
    - **Reference**: CU04
    - **PreCondition**: User has a buttonList (ButtonList) already available.
    - **PostConditions**:
      - The variable occurence of button (ItemButton) will be reduced by 1.
      - If the variable occurence of button is equal to 0:
        - delete instance of button.
        - delete association between the button and buttonList.
  
2. **Contract** : updateButonList()
    - **Reference**: CU04
    - **PreCondition**: User has a buttonList (ButtonList) already available.
    - **PostConditions**:
      - The derived variable probability of each ItemButton of buttonList is updated.

### RDCU

1. RDCU of clickItemButton(CU04)

![RDCU of clickItemButton(CU04)](https://www.plantuml.com/plantuml/png/0/RP5FQyCm3CNl_XIYf_RGqiDEXfRIRh11OJ3exegZjAQER6nbVxxzd6HPM5CVZB3U-pq9xv9WbAPsAbqj1unOGv9lH_cErjnqIggmSL9v5iQQu9rYYOnAh6J7s-FX1Bu2uwovlWZL-qR4y_nmMZyibCe8iSO6P84PXd38bEYTewZ7SWQO0Cr_ST5nz8ZiL0NSKnrj4ht_AtkbKugz43Ygf9qGZOOnKostQ41FvXvB3JrySSCfD3pRyoMpBfIiPuLckIrWaAyw8fNpYSzfEFhFx6k2itpkVMxmjOEl8jN-WrwDQIAnePRXWmnaFxmds6nWhI2VISJJLw0eNQyFW3i9lyiE2nANa7EKskKg__uF "RDCU of clickItemButton(CU04)")

2. RDCU of updateButonList(CU04)

![RDCU of updateButonList(CU04)](https://www.plantuml.com/plantuml/png/0/RP6nQiCm48RtUueZapEaTEYa8OIu7GeTIY7TJ_A9Y9ub8PsXVVlAQR2RqaKSqg_l-uKELQdeD0hKZn0p5HgnwfTmMqjmVqu6zZI9-XGrqiZupcMWIA11sustn_w4oUEK1r8-JfhYIwZQzQVxXor0GsXm8LDKt53EVQEK9CB5hEC6gIAvsx2TzCeonsMy9AtybpJFokDFyf8A5Y0cPHJsEZUqOl3fCtDH8BVRMq63g-HkUK3Rg5shBYbbzAaWaplZIiSPfcV6jTQjADX5P6Mt3tOHNIMl9TdkbphQcLwt21m7dBq0S6Xp-uXl "RDCU of updateButonList(CU04)")


## CU06 Reset the Button List

## [Return to README](../../README.md)