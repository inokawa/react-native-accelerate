#include <jni.h>
#include "example.h"

extern "C" JNIEXPORT void JNICALL
Java_com_reactnativeaccelerate_AccelerateModule_setup(JNIEnv *env, jclass clazz, jlong jsiPtr)
{
  example::setup(*reinterpret_cast<facebook::jsi::Runtime *>(jsiPtr));
}

extern "C" JNIEXPORT void JNICALL
Java_com_reactnativeaccelerate_AccelerateModule_cleanUp(JNIEnv *env, jclass clazz)
{
  example::cleanUp();
}
