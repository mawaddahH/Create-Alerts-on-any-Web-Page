# Create-Alerts-on-any-Web-Page
Assignment 4 W9D5 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Create an automation script using selenium to handle alerts on a web page.

Use any website with an alerts option.

- STEP 1: Find a website with an alert option
- STEP 2: Evoke the browser
- STEP 3: Navigate to the website
- STEP 4: Find the web elements for the alert
- STEP 5: Shift to alert
- STEP 6: Get alert text (for our reference)
- STEP 7: Dismiss alert
- STEP 8: Accept alert

## Answer
I used a ["demoqa"](https://demoqa.com/alerts) website

### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code.

I used `getWindowHandle` method to I can go back to the main window after the alert close.

```md
String mainWindow = driver.getWindowHandle();
driver.switchTo().window(mainWindow);
```

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183262075-1e61b10f-1a3d-491c-a957-0fec79018f6b.png" width=60% height=60%>
</p>


---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183262086-ab51da27-a092-4a51-9628-05bd170b010d.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/183262155-e9b54ada-1207-4318-92f6-3cef3c95e3eb.mp4

</p>
