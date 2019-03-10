# JSONStudent

1. Nowy projekt - JSONStudent_XX - pl.sda.jsonstudent
2. Do projektu dodać Mavena i zależność fasterxml
- a groupId - pl.sda
- b Stworzyc repozytorium na github

3. W głównym pomie stworzyć trzy moduły (zastanowic się nad dziedziczeniem):
	- studentmodel
	- readstudent
	- savestudent

każdy moduł powinien zawierać paczkę: pl.sda.(nazwa_modulu)	

	
Moduł studentmodel:	
1. Zawiera klase Student z polami:
	- name: String
	- lastname: String
	- index: Integer

Moduł savestudent:
1. Tworzy liste sutendtów (5) i zapisuje ją do pliku w formie json
	
Moduł readstudent:
1. Odczytuje studentów i wyświetla je w termialu.
2. Wyświetla studentów których imiona zaczynają się na literę A (lambda)