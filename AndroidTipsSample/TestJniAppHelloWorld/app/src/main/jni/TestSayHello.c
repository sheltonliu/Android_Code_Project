// Created by liushuo on 17/6/25.

#include "com_utils_NDKUtils.h"

/*
    方法实现
 * Class:     com_utils_NDKUtils
 * Method:    sayHello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_utils_NDKUtils_sayHello
  (JNIEnv *env, jclass jobj){

    return (*env)->NewStringUTF(env,"hello jni");

  }




