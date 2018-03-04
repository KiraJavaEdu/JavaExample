#include<jni.h>
#include <stdio.h>
#include "chapter4_NativeDemo_NativeDemo.h"

JNIEXPORT void JNICALL Java_chapter4_NativeDemo_NativeDemo_displayHelloWorld(JNIEnv * env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}