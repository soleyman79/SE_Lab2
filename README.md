# آزمایش دوم: SOLID
## روش TDD
ایجاد این پروژه به کمک روش Test Driven Development یا همان TDD انجام شده است. ابزار مورد استفاده نیز Junit می‌باشد.
## مراحل آزمایش
در ابتدا مطابق تصویر زیر پروژه از remote repository گرفته می‌شود.

![1](https://github.com/soleyman79/SE_Lab2/assets/59166192/e6f5bebd-84b2-4c96-bb17-5edbbf35bef0)

## پاسخ پرسش‌ها
+ هر یک از پنج اصل **SOLID** را در دو الی سه خط توضیح دهید.
  + اصل Single Responsibility Principle یا **SRP**
    + هر کلاس باید یک مسئولیت واحد و معین داشته باشد و علت تغییر در آن فقط به یک دلیل مشخص محدود شود. رعایت این اصل باعث افزایش cohesion کلاس‌های موجود در برنامه خواهد شد.
  + اصل Open/Closed Principle یا **OCP**
    + برنامه باید برای توسعه باز و برای تغییر بسته یا اصطلاحا باید open to extension and closed to modification باشد. به این معنی که برای تغییر عملکرد برنامه نیازی به تغییر کد اصلی نباشد. بلکه با افزودن کد جدید یا موردی که با پیش‌فرض‌های موجود سازگاری دارد؛ برنامه تغییر کند.
  + اصل Liskov Substitution Principle یا **LSP**
    + این اصل یک شرط مهم برای رابطه توارث در برنامه‌های مختلف بیان می‌کند. اصل LSP بیان می‌دارد نمونه‌های کلاس‌های فرزند باید بتوانند به عنوان نمونه‌های کلاس پدر مورد استفاده قرار بگیرند. اصطلاحاً گفته می‌شود که childer should not expect more or provied less than their parents.
  + اصل Interface Segregation Principle یا **ISP**
    + واسط‌ها یا همان interface ها نباید به گونه‌ای طراحی شوند که وابستگی به ویژگی‌ها یا عملکردهای لازم را برای کاربرد سازماندهی شده داشته باشند، بلکه باید با استفاده از رابط‌های کوچک‌تر و متمرکزتر، کاربردهای خاص خود را پوشش دهند.
  + اصل Dependency Inversion Principle یا **DIP**
    + وابستگی یا couple بودن عناصر مختلف برنامه باید در سطح interface اتفاق بیفتد؛ و نه در سطح concrete class ها. با رعایت این اصل تغییرات در پشت واسط‌ها متغیر شده و می‌توان DIP را علتی برای OCP دانست.
+ اصول SOLID در کدام یک از گام‌های اصلی ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، تست و استقرار) استفاده می‌شوند؟ توضیح دهید.
+ در چرخه‌ی عمومی ایجاد نرم‌افزار، آزمون نرم‌افزار دیرتر از پیاده‌سازی نرم‌افزار انجام می‌شود، اما در روش TDD تست‌نویسی پیش از پیاده‌سازی شروع می‌شود. آیا این دو مورد با هم تناقضی دارند؟ توضیح دهید.
+ فرض کنید در آزمایش بالا نیازی به تغییر ابعاد مستطیل نداشتیم. آیا در این حالت می‌توانستیم مربع را از مستطیل به ارث ببریم؟ توضیح دهید.
