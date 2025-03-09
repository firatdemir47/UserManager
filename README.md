📚 Student Management API
Student Management API projesi, öğrenci verilerini yönetmek için geliştirilmiş bir RESTful API'dir.
🚀 Teknolojiler
Spring Boot
JPA
Spring Validation
Spring ControllerAdvice
⚡ API Son Noktaları
Öğrenci Kaydetme - POST /rest/api/student/save
Öğrencileri Listeleme - GET /rest/api/student/list
Öğrenci Bilgisi Getirme - GET /rest/api/student/list/{id}
Öğrenci Güncelleme - PUT /rest/api/student/update/{id}
Öğrenci Silme - DELETE /rest/api/student/delete/{id}
🛠️ Proje Yapısı
Student.java: Öğrenci verilerini tutar.
StudentControllerImpl.java: REST API uç noktalarını tanımlar.
StudentServiceImpl.java: İş mantığını içerir.
StudentRepository.java: Veritabanı işlemlerini gerçekleştirir.
DTO ve DtoStudentIU.java: Veri transfer objeleri.
GlobalExceptionHandler.java: Hata yönetimi.
💻 Projeyi Çalıştırmak
Klonlayın: git clone https://github.com/firatdemir/student-management-api.git
Bağımlılıkları yükleyin: mvn clean install
Uygulamayı başlatın: mvn spring-boot:run
📜 Lisans
MIT Lisansı
📬 İletişim
E-posta: dferhat263@gmail.com
GitHub: https://github.com/firatdemir47
