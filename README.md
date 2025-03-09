# UserManager
Student Management API

Bu proje, öğrenci yönetimi için bir RESTful API sunmaktadır. Kullanıcılar öğrenci bilgilerini kaydedebilir, güncelleyebilir, silebilir ve tüm öğrencileri listeleyebilirler. Uygulama Spring Boot ve JPA kullanılarak geliştirilmiştir.

Özellikler

Öğrenci kaydetme, güncelleme ve silme işlemleri.
Öğrencileri listeleme ve belirli bir öğrenciyi ID'ye göre sorgulama.
Spring Validation ile veri doğrulama.
Hata yönetimi ve anlamlı hata mesajları ile kullanıcı dostu yanıtlar.
Kullanılan Teknolojiler

Spring Boot: Backend geliştirme için kullanıldı.
JPA (Java Persistence API): Veritabanı ile etkileşim için kullanıldı.
Spring Validation: Kullanıcıdan gelen verilerin doğruluğunu kontrol etmek için kullanıldı.
Spring ControllerAdvice: Global exception handling işlemleri için kullanıldı.
API Son Noktaları

1. Öğrenci Kaydetme
URL: /rest/api/student/save
Method: POST
Body:
{
  "firstName": "John",
  "lastName": "Doe",
  "birthOfDate": "1990-01-01",
  "email": "john.doe@example.com",
  "tckn": "12345678901"
}
Response:
{
  "firstName": "John",
  "lastName": "Doe"
}
2. Öğrencileri Listeleme
URL: /rest/api/student/list
Method: GET
Response:
[
  {
    "firstName": "John",
    "lastName": "Doe"
  },
  {
    "firstName": "Jane",
    "lastName": "Smith"
  }
]
3. Öğrenci Bilgisi Getirme
URL: /rest/api/student/list/{id}
Method: GET
Response:
{
  "firstName": "John",
  "lastName": "Doe",
  "birthOfDate": "1990-01-01",
  "email": "john.doe@example.com"
}
4. Öğrenci Güncelleme
URL: /rest/api/student/update/{id}
Method: PUT
Body:
{
  "firstName": "John",
  "lastName": "Doe",
  "birthOfDate": "1990-02-01"
}
Response:
{
  "firstName": "John",
  "lastName": "Doe"
}
5. Öğrenci Silme
URL: /rest/api/student/delete/{id}
Method: DELETE
Response: 200 OK (başarılı işlem)
Hata Yönetimi

Projede hata yönetimi, kullanıcıya anlamlı ve doğru hata mesajları dönecek şekilde yapılandırılmıştır. Spring Validation kullanılarak gelen verilerin doğruluğu kontrol edilmekte ve hatalı verilerle karşılaşıldığında kullanıcı dostu hata mesajları sunulmaktadır.

Örneğin, firstName alanı boş bırakılırsa şu şekilde bir hata mesajı dönecektir:

{
  "id": "some-unique-id",
  "errorTime": "2025-03-09T12:00:00Z",
  "errors": {
    "firstName": ["Firstname alanı boş bırakılamaz!"]
  }
}
Proje Yapısı

1. Student Entity (Student.java)
Student sınıfı, öğrenci verilerini tutan bir JPA Entity sınıfıdır. Her bir öğrenci, ID, adı, soyadı, doğum tarihi gibi bilgileri içerir.

2. StudentController (StudentControllerImpl.java)
StudentControllerImpl sınıfı, öğrenci verileriyle ilgili işlemleri yöneten RESTful API endpoint'lerini sağlar. Bu sınıf, IStudentController arayüzünü implement eder ve gelen HTTP isteklerini karşılar.

3. StudentService (StudentServiceImpl.java)
StudentServiceImpl sınıfı, öğrenci verilerini işleyen ve veritabanı ile etkileşimde bulunan servis katmanıdır. Bu sınıf, öğrenci kaydetme, güncelleme, silme ve listeleme işlemlerini içerir.

4. DTO ve DtoStudentIU (DTOStudent.java, DtoStudentIU.java)
DTOStudent: Öğrencinin kullanıcıya gösterilen temel bilgilerini taşır.
DtoStudentIU: Öğrenci bilgilerini almak ve güncellemek için kullanılan veri transfer objesidir (DTO). Kullanıcıdan alınan verileri doğrulamak için Spring Validation kullanılır.
5. StudentRepository (StudentRepository.java)
StudentRepository, JPA repository arayüzüdür ve öğrenci verilerini veritabanına kaydetmek, sorgulamak ve silmek için kullanılır.

6. GlobalExceptionHandler (GlobalExceptionHandler.java)
Bu sınıf, global exception handling işlemlerini yönetir. Validasyon hataları ve diğer beklenmedik hatalar için kullanıcıya anlamlı hata mesajları döner.

Katkıda Bulunma

Projeyi GitHub üzerinde forklayın.
Yeni özellikler ekleyin veya mevcut hataları düzeltin.
Pull request (PR) göndererek katkıda bulunun.
Lisans

MIT Lisansı ile lisanslanmıştır.

İletişim

E-posta: dferhat263@gmail.com
GitHub: https://github.com/firatdemir47
