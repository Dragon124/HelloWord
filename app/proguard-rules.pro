#-renamesourcefileattribute SourceFile
#包明不混合大小写，混淆后的类名为小写
-dontusemixedcaseclassnames
#指定不去忽略非公共的库的类
-dontskipnonpubliclibraryclasses
#指定不去忽略非公共的库的类的成员
-dontskipnonpubliclibraryclassmembers
#不做预校验，preverify是proguard的4个步骤之一，android不需要做预校验，去除这一步可以加快混淆速度
-dontpreverify
#忽略所有警告
-ignorewarnings
#混淆时是否记录日志
-verbose
#不优化输入的类文件
#-dontoptimize
#指定混淆时采用的算法，后面的参数是一个过滤器
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*,!code/allocation/variable
#保护注解
-dontwarn android.annotation
-keepattributes *Annotation*
#保护异常
-keepattributes Exceptions
#保护反射
-keepattributes EnclosingMethod
#保护代码中的泛型不被混淆
-keepattributes Signature
#抛出异常时保留代码行号
-keepattributes SourceFile,LineNumberTable
#如果引用了v4或者v7包
-dontwarn android.support.**
-keep class android.support.** {*;}
#保持 native 方法不被混淆
-keepclasseswithmembernames class * { native <methods>; }
#保持自定义控件类不被混淆
-keep public class * extends android.app.Fragment
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class * extends android.view.View
-keep public class * extends android.support.**
# 保留继承的
-dontwarn android.support.v4.**
-keep class android.support.v4.app.** { *; }
-keep interface android.support.v4.app.** { *; }
-keep class android.support.v4.** { *; }

-dontwarn android.support.v7.**
-keep class android.support.v7.internal.** { *; }
-keep interface android.support.v7.internal.** { *; }
-keep class android.support.v7.** { *; }

-keep public class * extends android.support.v4.**
-keep public class * extends android.support.v7.**
-keep public class * extends android.support.annotation.**

-dontwarn android.support.design.**
-keep class android.support.design.** { *; }
-keep interface android.support.design.** { *; }
-keep public class android.support.design.R$* { *; }
#WebView与JavascriptInterface
-keep public class android.webkit.WebView {*;}
-keep public class android.webkit.WebViewClient {*;}
-keepattributes *JavascriptInterface*
-keepclassmembers class **$JavaScriptObject { public *; }
#保持 Parcelable 不被混淆
-keep class * implements android.os.Parcelable { public static final android.os.Parcelable$Creator *; }
#保持 Serializable 不被混淆
-keepclassmembers class * implements java.io.Serializable { <fields>; }
#保持枚举 enum 类不被混淆
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}
#不混淆资源类
-keepclassmembers class **.R$* { public static <fields>; }

# aop注解
-adaptclassstrings
-keepattributes InnerClasses, EnclosingMethod, Signature, *Annotation*
-keepnames @org.aspectj.lang.annotation.Aspect class * {
    ajc* <methods>;
}
-keepclassmembers class ** {
    @com.example.helloword.aop.annotation.ClickBehavior <methods>;
}
