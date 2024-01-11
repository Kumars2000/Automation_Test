@Completed
Feature: Homepage tab verification
  

 
  Scenario: Verify that the title tab link are navigating to desired page
  Given Open the amazone application and verify the title
  When Click on the best seller application
  Then Verify the Best seller tab
  And Click on the todays deal and verify the todays deal page
  And click on the Mobile tab and veryfay the page
  And click on the customore service tab and veryfay the page
  And click on the electronic tab and veryfay the page
  And click on new releases tab and veryfay the page
  And click on the gift ideas tab and veryfay the page
  And click on the Home & Kitchen and veryfay the page
  And click on the Fashion tab and veryfay the page
  And click on the amazone pay tab and veryfay the page
 
Scenario Outline: verify that the Best seller Quick access link
  Given Open the amazone application and verify the title
  Then Verify the Best seller tab
  When user click on "<value>" link
  
  Examples: 
  | value |
  |Amazon Launchpad|
|Amazon Renewed|
|Apps for Android|
|Baby Products|
|Bags, Wallets and Luggage|
|Beauty|
|Books|
|Car & Motorbike|
|Clothing & Accessories|
|Computers & Accessories|
|Electronics|
|Garden & Outdoors|
|Gift Cards|
|Grocery & Gourmet Foods|
|Health & Personal Care|
|Home & Kitchen|
|Home Improvement|
|Industrial & Scientific|
|Jewellery|
|Kindle Store|
|Movies & TV Shows|
|Music|
|Musical Instruments|
|Office Products|
|Pet Supplies|
|Shoes & Handbags|
|Software|
|Sports, Fitness & Outdoors|
|Toys & Games|
|Video Games|
|Watches|


Scenario Outline: verify that the Electronic Quick access link
Given Open the amazone application and verify the title
And click on the electronic tab and veryfay the page
When user click on the "<value>" link
Examples: 
  | value |
  | Accessories |
  | Cameras & Photography |
  | Car & Vehicle Electronics |
  | Computers & Accessories |
  | GPS & Accessories |
  | Home Audio |
  | Home Theater, TV & Video |
  | Home Theater, TV & Video |
  | Mobiles & Accessories |
  | Portable Media Players |
  | Radio Communication |
  | Tablets |
  | Telephones & Accessories |
  | Warranties |
  | eBook Readers & Accessories |
  | Wearable Technology |
  | General Purpose Batteries & Battery Chargers |
  | Headphones, Earbuds & Accessories |
  | Power Accessories |
  
  
  
  
  Scenario Outline:  verify that the mobile Quick access link
Given Open the amazone application and verify the title
 And click on the Mobile tab and veryfay the page
When user click on the "<value>" link
  
  Examples: 
  | value |
  | Mobile Accessories |
  | Mobile Broadband Devices |
  | SIM Cards |
  | Smartphones & Basic Mobiles |
  | Smartwatches |
 
 
Scenario Outline:  verify that the new releases Quick access link
Given Open the amazone application and verify the title
And click on new releases tab and veryfay the page
When user click on "<value>" link
  
  Examples: 
  | value |
|Amazon Launchpad|
|Amazon Renewed|
|Baby Products|
|Bags, Wallets and Luggage|
|Beauty|
|Books|
|Clothing & Accessories|
|Computers & Accessories|
|Electronics|
|Garden & Outdoors|
|Health & Personal Care|
|Home & Kitchen|
|Home Improvement|
|Jewellery|
|Kindle Store|
|Movies & TV Shows|
|Music|
|Musical Instruments|
|Office Products|
|Pet Supplies|
|Shoes & Handbags|
|Sports, Fitness & Outdoors|
|Toys & Games|
|Video Games|
|Watches|


Scenario Outline: verify that the Home & Kitchen Quick access link
  Given Open the amazone application and verify the title
  And click on the Home & Kitchen and veryfay the page
  When user click on "<value>" link
  Examples: 
  | value |
 |Living Room|
|Bedroom|
|Kitchen|
|Garage|
|Living Room|
|Bedroom|
|Kitchen|
|Garage|
|Featured categories|
|Kitchen & Home appliances|
|Kitchen & dining|
|Home decor|
|Home furnishing|
|Furniture & mattresses|
|Garden & outdoors|
|Storage & Organisation|
|Lighting|
|Cookware|
|Kitchen Storage|
|Dinner Sets|
|Glass ware|
  |Juicer Mixer grinder|
|Water Purifier|
|Geysers|
|Iron|
|Home decor|
|Home furnishing|
|Storage & Organisation|
|Lighting|
|Office chairs & study desks|
|Sofas & recliners|
|Mattresses|
|Beds|
|Power & Hand Tools|
|Cleaning supplies|
|Kitchen & Bath Fixtures|
|Electrical|
|Organic Gardening|
|Seeds|
|Planters|
|Indoor Plants|
|Air conditioners|
|Refrigerators|
|Washing Machines|
|Microwave|
| Artwork|
|Craft Materials|
|Furniture|
|Heating, Cooling & Air Quality|
|Home & Décor|
|Home Furnishing|
|Home Improvement|
|Home Storage & Organisation|
|Indoor Lighting|
|Kitchen & Dining|
|Kitchen & Home Appliances|
|Large Appliances|
|Religious & Spiritual Items|
|Warranties|