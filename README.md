# WM - SYSTEM INFORMATYCZNY WSPOMAGAJĄCY SKŁADOWANIE TOWARU W MAGAZYNIE
Celem projektu było stworzenie systemu informatycznego wspomagającego składowanie towaru w magazynie. System ten oferuje możliwość utworzenia produktu, wprowadzenia go na stan magazynowy wraz z przydzieleniem go do utworzonej lokalizacji w magazynie, która wskazuje na konkretną półkę na regale magazynowym. Produkt można przenieść z lokalizacji na lokalizację oraz wydać klientowi.
System informatyczny jest złożony z aplikacji internetowej wykonanej w technologii Java Enterprise Edition i relacyjnej bazy danych. Model trójwarstwowy umożliwił rozdzielenie warstwy widoku, dostępnego z poziomu przeglądarki internetowej, warstwy logiki biznesowej oraz warstwy składowania danych w relacyjnej bazie danych. Środowiskiem programistycznym użytym w celu napisania systemu w języku Java był program NetBeans IDE, a środowiskiem uruchomieniowym serwer aplikacyjny Payara wraz z systemem zarządzania bazami danych Java DB.
System dostarcza różne funkcjonalności w zależności od przypisanego użytkownikowi poziomu dostępu. Użytkownik systemu, w zależności od preferencji językowych ustawionych we współczesnej przeglądarce internetowej, ma możliwość obsługi programu w polskiej lub angielskiej wersji językowej. System pozwala na jednoczesny dostęp do danych wielu uwierzytelnionym użytkownikom, dzięki przetwarzaniu transakcyjnemu (ang. On-Line Transactional Processing) i zastosowaniu blokad optymistycznych.
Technologie i narzędzia zastosowane przy realizacji projektu:
- język programowania Java 8;
- Java Development Kit w wersji 1.8;
- środowisko programistyczne NetBeans IDE w wersji 8.2;
- Maven w wersji 3.1;
- platforma programistyczna Java Enterprise Edition  w wersji 7.0;
- Context and Dependency Injection w wersji 1.2;
- Java Server Faces w wersji  2.2;
- PrimeFaces  w wersji 5.0;
- Bootstrap w wersji 3.3;
- jQuery w wersji 3.2.1;
- Java Transaction API 1.2;
- Java Persistence API 2.5.2;
- serwer aplikacyjny Payara w wersji 5.183;
- Java DB (Apache Derby) odpowiedzialna za składowanie danych w wersji 10.13.1.1.

Dla wymienionych niżej funkcjonalności zdefiniowane zostały trzy poziomy dostępu. Poziom dostępu odpowiada zatrudnieniu pracownika w konkretnym dziale z podziałem na administratora systemów informatycznych (Administracja), magazyniera (Magazyn) i pracownika biura (Biuro).
Administrator zarządza kontami pracowników, osobiście odpowiada za weryfikację danych personalnych użytkownika na podstawie okazanego przez niego dokumentu tożsamości, a następnie poprzez przydzielenie poziomu dostępu, autoryzuje konto, które może aktywować i dezaktywować. Pracownik biura zarządza produktem oraz kontami kontrahentów. Magazynier zarządza lokalizacjami w magazynie, które stanowią wydzieloną przestrzeń półki na regale magazynowym, służącym do składowania towaru oraz stanami magazynowymi na tych lokalizacjach, czyli produktami w określonej liczbie sztuk, które zostały dostarczone przez kontrahentów.
System udostępnia następujące funkcjonalności:
• Rejestrowanie kont użytkowników wraz z autoryzacją kont poprzez przypisanie im odpowiedniego poziomu dostępu.
• Uwierzytelnianie użytkowników i autoryzację względem przypisanego do konta poziomu dostępu.
• Przechowywanie wzorców loginów i haseł kont użytkowników w relacyjnej bazie danych, przy czym haseł w postaci niejawnej jako skrót wyliczony algorytmem SHA256.
• Edycję danych personalnych użytkowników.
• Aktywację i dezaktywację utworzonego konta.
• Zmianę własnego hasła każdemu użytkownikowi oraz resetowanie hasła użytkownikowi nieuwierzytelnionemu.
• Tworzenie i edycję produktu o określonych cechach.
• Tworzenie i edycję lokalizacji składowania towarów w magazynie w formacie opisującym: alejkę – numer regału – półkę – pozycję na półce (np. XX-00-00-00) oraz o maksymalnej dopuszczalnej wadze z uwzględnieniem nośności półki regału magazynowego.
• Przeniesienie towaru z jednej lokalizacji na drugą.
• Wprowadzenie na stan magazynowy towaru od danego kontrahenta wraz z liczbą sztuk na konkretną lokalizację w magazynie.
• Wydanie ze stanu magazynowego towaru w określonej liczbie sztuk z konkretnej lokalizacji dla danego kontrahenta.
• Wyświetlenie stanu magazynowego.
• Rejestrację kont kontrahentów w celu zachowania ich danych. Kontrahentami są zarówno firmy jak i osoby fizyczne, dostawcy od których pochodzi towar wprowadzany na stan oraz klienci dla których towar jest wydawany ze stanu.
• Resetowanie danych kontrahentów.
• Usunięcie produktu o ile ten nie ma stanu magazynowego.
• Usunięcie pustej lokalizacji, czyli takiej bez przypisanego produktu wraz z liczbą sztuk, jest możliwe w przypadku likwidacji regału magazynowego.

Wymagania niefunkcjonalne wynikające z potrzeb użytkownika:
• Uwierzytelnienie się poprzez podanie unikalnego, niezmiennego loginu oraz hasła.
• Wylogowanie się uwierzytelnionego użytkownika następuje automatycznie po upływie 25 minut nieaktywności, kiedy to sesja uwierzytelnionego użytkownika zostanie zakończona lub ze skutkiem natychmiastowym na żądanie użytkownika.
• Każdy użytkownik dysponuje indywidualnym kontem. Użytkownik może korzystać z konta jeżeli posiada ono przypisany poziom dostępu, jest potwierdzone i aktywne.
• Każde konto ma przypisany jeden poziom dostępu.
• Użytkownik ma przydzielone uprawnienia do konkretnych funkcji systemu zależne od przypisanego poziomu dostępu.
• Wielodostępność systemu umożliwia jednoczesną pracę wielu użytkowników. Koordynowanie dostępu do danych odbywa się z wykorzystaniem transakcji i blokad optymistycznych.
• Zapewniona jest obsługa błędów oraz przechowywanie historii zdarzeń w dziennikach systemowych.
• Ujednolicony graficzny interfejs użytkownika pozwala na obsługę systemu z wykorzystaniem współczesnej przeglądarki internetowej.
• Internacjonalizacja w interfejsie użytkownika udostępnia dwie wersje językowe: polską i angielską. Dane wprowadzone do aplikacji poprzez formularze nie podlegają internacjonalizacji.
• Dane biznesowe przechowywane są w relacyjnej bazie danych z wykorzystaniem mapowania obiektowo-relacyjnego.
• Serwer aplikacyjny, na którym działa aplikacja ma bieżący czas systemowy zgodny z aktualnym czasem.
• System informatyczny przechowuje w bazie danych informacje o ostatniej operacji na obiekcie wraz z datą i godziną modyfikacji tego obiektu oraz użytkownikiem, który dokonał modyfikacji. Do czasu usunięcia obiektu zachowana jest również data i godzina utworzenia obiektu oraz informacja o tym, kto utworzył obiekt. Przypisane konto uwierzytelnionego użytkownika pobierane jest z bieżącego logowania, a data i godzina są zbieżne są z czasem systemowym.
