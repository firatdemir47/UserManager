📚 Student Management API
Student Management API projesi, öğrenci verilerini yönetmek için geliştirilmiş bir RESTful API'dir. Bu API ile öğrencileri kaydedebilir, güncelleyebilir, silebilir ve listeleyebilirsiniz. Spring Boot ve JPA kullanılarak oluşturulmuş olup, hata yönetimi ve doğrulama işlemleri ile kullanıcı dostu bir sistem sunmaktadır.
🚀 Teknolojiler
Spring Boot - Backend geliştirme.
JPA (Java Persistence API) - Veritabanı işlemleri.
Spring Validation - Veri doğrulama.
Spring ControllerAdvice - Global exception handling.
⚡ API Son Noktaları
1. Öğrenci Kaydetme
URL: /rest/api/student/save
Method: POST
Body:
json
{
  "firstName": "John",
  "lastName": "Doe",
  "birthOfDate": "1990-01-01",
  "email": "john.doe@example.com",
  "tckn": "12345678901"
}
Response:
json
{
  "firstName": "John",
  "lastName": "Doe"
}
2. Öğrencileri Listeleme
URL: /rest/api/student/list
Method: GET
Response:
json
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
json
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
json
{
  "firstName": "John",
  "lastName": "Doe",
  "birthOfDate": "1990-02-01"
}
Response:
json
{
  "firstName": "John",
  "lastName": "Doe"
}
5. Öğrenci Silme
URL: /rest/api/student/delete/{id}
Method: DELETE
Response: 200 OK (başarılı işlem)
🛠️ Proje Yapısı
Student Entity (Student.java)
Student sınıfı, öğrenci verilerini tutar ve veritabanıyla etkileşimi sağlar.
Student Controller (StudentControllerImpl.java)
StudentControllerImpl, REST API uç noktalarını tanımlar ve gelen HTTP isteklerini yönetir.
Student Service (StudentServiceImpl.java)
Bu servis sınıfı, öğrenci verileriyle ilgili iş mantığını içerir ve veritabanı işlemlerini gerçekleştirir.
DTO ve DtoStudentIU (DTOStudent.java, DtoStudentIU.java)
DTOStudent: Kullanıcıya gösterilen öğrenci bilgilerini taşır.
DtoStudentIU: Kullanıcıdan alınan öğrenci verilerini doğrulamak için kullanılan DTO.
Student Repository (StudentRepository.java)
StudentRepository, öğrenci verilerini JPA kullanarak veritabanına kaydeder, okur, günceller ve siler.
GlobalExceptionHandler (GlobalExceptionHandler.java)
Global exception handling sınıfıdır. Hataları yönetir ve kullanıcıya anlamlı hata mesajları sunar.
💡 Hata Yönetimi
Projede Spring Validation kullanılarak gelen verilerin doğruluğu kontrol edilir. Eğer veriler hatalıysa, kullanıcılara anlamlı hata mesajları döner. Örneğin:
json
{
  "id": "unique-error-id",
  "errorTime": "2025-03-09T12:00:00Z",
  "errors": {
    "firstName": ["Firstname alanı boş bırakılamaz!"]
  }
}
💻 Projeyi Çalıştırmak
Projeyi GitHub üzerinden klonlayın:
bash
git clone https://github.com/firatdemir/student-management-api.git
Maven bağımlılıklarını yükleyin:
bash
mvn clean install
Uygulamayı başlatın:
bash
mvn spring-boot:run
API'yi kullanmaya başlayabilirsiniz.
🤝 Katkıda Bulunma
Katkıda bulunmak için şu adımları izleyebilirsiniz:
Projeyi fork'layın.
Yeni bir feature ekleyin veya hatayı düzeltin.
Pull request gönderin.
📜 Lisans
Bu proje MIT Lisansı ile lisanslanmıştır.
📬 İletişim
E-posta: dferhat263@gmail.com
GitHub: https://github.com/firatdemir47
