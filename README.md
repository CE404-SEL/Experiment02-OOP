# آزمایش دوم | اصول شی‌گرایی

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
