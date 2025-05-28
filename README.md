# kiranchaudry
opdracht Enterprise application
#beschrijving
### Model items aangemaakt
- Event met de private met de inhoud van van primary key en id , relaties gebruikt nadien ook gebruikt van getter en setters
- Locatie met de private meet de inhoud van primary key en id vooral ook getter en setter en overide gebruikt
### DAO objecten gebruikt als interface
- Locatie DAO om te valideren en dataopslag
- Event DAO dataopslag vooral het lijsten van uit de event op te zoeken en sorteren op datum en tijd van nieuwste naar oudste
### controller
- WebEventController beans gebruikt en te laten contol hebben van de uitvoering van de url , gebruikt om alle inhoud van de GET , POST inhoud te kunnen overnemen of zetten en nadien nog ook plaatsen ook , en terug te kunnen sturen , en tonen van event , locaties , nadien ook nog kunnen opslaan van evenement en ze teovoegen

- EventRestController om te tesen bij postman , nadien heb ik ook beans toegevoeg om met andere model of interface te laten verwerken
get,post , put  gebruikt om alle event te kunnen tonen en sorteren map gebruikt en rest api gebruikt van json om antwoord ook terug te geven , en put om event toevoegen en te opslaan en te updaten, delete als de inhoud niet aanwezig is en return geven verwijderen van api

### thymeleaf 
#### gebruik van de layouts het weergave kunnen tonen en vooral de navigatie kunnen bezoeken bij specifieke path kunnen bekijken en event toevoegen
- index.html de hoofdpagina waar alle event en de nieuwe event weergegeven worden
- new.html waar je nieuwe event kan teovoegen
_ details.html waar je inhoud van de event kan bekijken door te klikken bij de index van bekijk
- about.html soort about niets specials

  ## afbeeldingen

  ### applicatie properties en dependencies
 ![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Application_properties.png)

 ![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/6058ef38904d1d88739a8459d97e0b208a1f899f/Project_EA_afbeeldingen/pom_depedencies.png)

 


## Model
### Event
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/2270bde22407ecd79a8689689b28322cafc7b1f0/Project_EA_afbeeldingen/EventModel_inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/EventModel_inhoud_2.png)
### Locatie
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/LocatieModel_inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/LocatieModel_inhoud_2.png)

## DAO object
### locatie en event
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/LocatieDAO_inhoud.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/EventDAO_inhoud.png)

## Controller
### eventrestcontroller

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/EvenRestController_Inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/EventRestController_inhoud_2.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/EventRestController_inhoud_3.png)

### webevencontroller

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/WebEventController_inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/WebEventController_inhoud_2.png)

## templates van thymeleaf
### index.html
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesIndex_inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesIndex_inhoud_2.png)


### details.html
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesDetails_inhoud_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesDetails_inhoud_2.png)

### new.html
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesNew_inhoud_1.png)


![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesNew_inhoud_2.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesNew_inhoud_3.png)

### about.html
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/TemplatesAbout_inhoud.png)

## Testing 

### browser check 

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Testen_browser_werkt.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Test_browser_1.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Test_browser_2.png)


### test new event toevoegen 


![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Inhoud_Evenement_test.png)

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/New_evenement_update_test.png)

## postman

![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/postman_check.png)

## Database weergave 
![alt](https://github.com/kiranchaudry97/ehb.be.kiran.chaudry/blob/e92d5deedd1e6a93aeb0d6041570a7cae630c18e/Project_EA_afbeeldingen/Mysql_tables_event.png)

