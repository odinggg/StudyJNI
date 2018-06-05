#include <jni.h>
#include <stdio.h>
#include <windows.h>
#include "com_qin_study_HelloJNI.h"

JNIEXPORT void JNICALL Java_com_qin_study_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}
JNIEXPORT jboolean JNICALL Java_com_qin_study_HelloJNI_SetVolumeLevel(JNIEnv *env, jobject thisObj, jint level){
    printf("level = %d\n",level);
    int i ;
    i = 0;
    printf("i = %d\n",i);
    i = i + level;
    printf("i = %d\n",i);
   return 1;
}