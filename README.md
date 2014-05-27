Uwagi:
- program do uruchomienia pod Eclipse - dodano pliki projektu.
- "quit" kończy działanie programu
- Cena zamiast w Double moglaby byc reprezentowana w BigDecimal dla dokladnosci.
- Metoda handleInput w PosControllerImpl jest synchronized, na wypadek gdyby wlaczylo sie wiecej obiektow klasy InputDevice.
- Stringi typu "exit" moglyby byc wyciagniete do pol statycznych.
- Dane o produktach są zawarte w ProductDaoStubImpl, dla wygodnego dzialania aplikacji, mozna byc uzyc easyMock do zamodelowania ProductDao.
