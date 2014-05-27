Uwagi:

- Cena w double moglaby byc reprezentowana w BigDecimal dla dokladnosci.
- Metoda handleInput w PosControllerImpl jest synchronized, na wypadek gdyby w³¹czy³o siê wiêcej obiektów klasy InputDevice.
- Stringi typu "exit" moglyby byc wyciagniete do pol statycznych.
- Dane zawarte w ProductDaoStubImpl, dla wygodnego dzialania aplikacji, mozna byc uzyc easyMock do zamodelowania ProductDao.
