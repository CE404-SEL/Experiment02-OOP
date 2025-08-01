# آزمایش دوم | اصول شی‌گرایی

## جدول تغییرات پروژه برای اضافه کردن امکان پیام با تلگرام

<table dir="rtl" style="width: 100%; border-collapse: collapse; margin: 20px 0;">
    <thead>
        <tr style="background-color: #f5f5f5;color:black;">
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">ردیف</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">محل اعمال تغیرات (کلاس/واسط)</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">عنوان تغییر</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">شرحی کوتاه از تغییر</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">1</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">MessageService</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن تابع ارسال پیام تلگرامی
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن یک تابع void با عنوان sendTelegramMessage که پارامتر TelegramMessage می‌پذیرد
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">2</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">TelegramMessage</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                ایجاد کلاس مدل پیام تلگرام
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                ایجاد کلاس TelegramMessage که از Message ارث‌بری می‌کند و دارای فیلدهای sourcePhoneNumber و targetPhoneNumber است
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">3</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">TelegramMessageService</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                ایجاد سرویس ارسال پیام تلگرام
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                ایجاد کلاس TelegramMessageService که MessageService را پیاده‌سازی می‌کند و شامل منطق ارسال پیام تلگرام و اعتبارسنجی شماره تلفن است
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">4</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">EmailMessageService</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                پیاده‌سازی تابع sendTelegramMessage
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن پیاده‌سازی خالی برای تابع sendTelegramMessage جهت رعایت قرارداد واسط MessageService
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">5</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">SmsMessageService</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                پیاده‌سازی تابع sendTelegramMessage
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن پیاده‌سازی خالی برای تابع sendTelegramMessage جهت رعایت قرارداد واسط MessageService
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">6</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Main</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن گزینه ارسال پیام تلگرام به منو
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن گزینه شماره 3 برای ارسال پیام تلگرام به منوی اصلی برنامه
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">7</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Main</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن case 3 به switch statement
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن case 3 برای دریافت اطلاعات پیام تلگرام از کاربر و ایجاد شیء TelegramMessage
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">8</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Main</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن شرط TelegramMessage به if-else
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن شرط else if برای بررسی نوع TelegramMessage و ایجاد TelegramMessageService مناسب
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">9</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Main</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن import برای TelegramMessage
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                افزودن دستور import برای کلاس TelegramMessage و TelegramMessageService
            </td>
        </tr>
    </tbody>
</table>

## جدول تحلیل اصول SOLID

<table dir="rtl" style="width: 100%; border-collapse: collapse; margin: 20px 0;">
    <thead>
        <tr style="background-color: #f5f5f5;color:black;">
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">اصل</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">موارد تحقق</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">موارد نقض</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Single Responsibility Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس <code>Message</code> به SRP پایبند است زیرا فقط محتوای پیام اصلی را مدیریت می‌کند<br>
                • کلاس‌های مدل (<code>EmailMessage</code>، <code>SmsMessage</code>) هر کدام مسئولیت خاص خود را دارند
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس‌های سرویس (<code>EmailMessageService</code>، <code>SmsMessageService</code>) با ترکیب منطق ارسال پیام با validation، SRP را نقض می‌کنند<br>
                • کلاس <code>Main</code> مسئولیت‌های متعددی دارد: دریافت ورودی، ایجاد پیام، انتخاب سرویس و ارسال پیام
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Open/Closed Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس‌های <code>EmailMessage</code> و <code>SmsMessage</code> از کلاس <code>Message</code> ارث‌بری می‌کنند و آن را گسترش می‌دهند
            <br>
                • رابط <code>MessageService</code> با تعریف متدهایی (<code>sendSmsMessage</code>، <code>sendEmailMessage</code>) بدون تغییر به OCP پایبند است
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • در <code>Main</code> از <code>instanceof</code> و <code>switch</code> استفاده شده که نقض OCP است
                <br>
                       • کلاس‌های پیاده‌سازی سرویس (<code>EmailMessageService</code>, <code>SmsMessageService</code>) با تغییر رفتار در هر کلاس (افزودن منطق validation) OCP را نقض می‌کنند
                <br>
                • کلاس <code>Main</code> برای اضافه کردن نوع جدید پیام نیاز به تغییر دارد
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Liskov Substitution Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس‌های <code>EmailMessage</code> و <code>SmsMessage</code> می‌توانند جایگزین کلاس <code>Message</code> شوند<br>
                • کلاس‌های <code>EmailMessageService</code> و <code>SmsMessageService</code> می‌توانند جایگزین <code>MessageService</code> شوند
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • متدهای اجرای سرویس (<code>sendSmsMessage</code>، <code>sendEmailMessage</code>) به زیرکلاس‌های خاصی از <code>Message</code> (<code>SmsMessage</code>، <code>EmailMessage</code>) وابسته‌اند که می‌تواند منجر به coupling و انعطاف‌پذیری کمتر شود<br>
                • در <code>EmailMessageService.sendSmsMessage()</code> و <code>SmsMessageService.sendEmailMessage()</code> بدنه خالی است که نقض LSP است
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Interface Segregation Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • رابط <code>MessageService</code> به درستی با متدهای خاصی برای هر نوع پیام تفکیک شده است
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • <code>EmailMessageService</code> مجبور است <code>sendSmsMessage</code> را پیاده‌سازی کند<br>
                • <code>SmsMessageService</code> مجبور است <code>sendEmailMessage</code> را پیاده‌سازی کند<br>
                • پیاده‌سازی‌های سرویس (<code>EmailMessageService</code>، <code>SmsMessageService</code>) کل رابط <code>MessageService</code> را اجرا می‌کنند، حتی اگر فقط از متدهای خاصی استفاده می‌کنند
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Dependency Inversion Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • رابط <code>MessageService</code> یک انتزاع را نشان می‌دهد که اجزای سطح بالاتر (کلاس <code>Main</code>) به آن بستگی دارند
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • عدم استفاده از Dependency Injection<br>
                • وابستگی مستقیم به کلاس‌های عینی به جای انتزاعی
                <br>
                • کلاس <code>Main</code> مستقیماً به پیاده‌سازی‌های مشخص (<code>EmailMessageService</code>، <code>SmsMessageService</code>) بستگی دارد، نه فقط به انتزاع (<code>MessageService</code>)
            </td>
        </tr>
    </tbody>
</table>

## جدول راه‌حل‌های پیشنهادی برای رفع نقض اصول SOLID

<table dir="rtl" style="width: 100%; border-collapse: collapse; margin: 20px 0;">
    <thead>
        <tr style="background-color: #f5f5f5;color:black;">
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">اصل مربوطه</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">علت نقض</th>
            <th style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">راه حل پیشنهادی</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Single Responsibility Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس‌های سرویس منطق ارسال و validation را ترکیب کرده‌اند<br>
                • کلاس <code>Main</code> مسئولیت‌های متعددی دارد
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • ایجاد کلاس‌های جداگانه برای validation: <code>EmailValidator</code> و <code>SmsValidator</code><br>
                • جداسازی منطق UI از منطق کسب‌وکار در کلاس <code>Main</code><br>
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Open/Closed Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • استفاده از <code>instanceof</code> و <code>switch</code> در <code>Main</code><br>
                • تغییر رفتار در کلاس‌های سرویس
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • ایجاد Factory Pattern برای ساخت پیام‌ها<br>
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Liskov Substitution Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • متدهای خالی در کلاس‌های سرویس<br>
                • وابستگی به زیرکلاس‌های خاص
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • حذف متدهای غیرضروری<br>
                • استفاده از Generic Types برای کاهش وابستگی به نوع خاص
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Interface Segregation Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • کلاس‌ها مجبور به پیاده‌سازی متدهای غیرضروری هستند<br>
                • رابط <code>MessageService</code> بیش از حد بزرگ است
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • فقط یک متد <code>sendMessage</code>
                داشته باشیم.
            </td>
        </tr>
        <tr>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: center; font-weight: bold;">Dependency Inversion Principle</td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • وابستگی مستقیم به کلاس‌های عینی<br>
                • عدم استفاده از Dependency Injection
            </td>
            <td style="border: 1px solid #ddd; padding: 12px; text-align: right;">
                • استفاده از Factory Pattern<br>
                • استفاده از dispatcher <br>
            </td>
        </tr>
    </tbody>
</table>
