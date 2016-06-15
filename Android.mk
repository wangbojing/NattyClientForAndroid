# Copyright (C) 2009 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := natty-client

LOCAL_C_INCLUDES := 	openssl_aes.h \
		   	openssl_aes_local.h \
		   	openssl_des.h \
		   	openssl_des_local.h \
		   	openssl_md5.h \
		   	openssl_md5_local.h \
		   	openssl_modes.h \
		   	openssl_md32_common.h \
		   	openssl_sha.h \
		   	openssl_sha_local.h \
		   	openssl_spr.h \
		   	NattyAbstractClass.h \
		   	NattyProtocol.h \
		   	NattyNetwork.h \
			NattyProtoClient.h \
		   	NattyRBTree.h

LOCAL_CFLAGS	+= -I $(LOCAL_PATH)/include -I $(LOCAL_PATH)

#LOCAL_C_INCLUDES := $(call all-include-dirs)


#LOCAL_SRC_FILES := hello-jni.c

LOCAL_SRC_FILES  := 	NattyClient-jni.c \
				./src/NattyAbstractClass.c \
		    	./src/NattyRBTree.c \
		    	./src/NattyTimer.c \
		    	./src/NattyNetwork.c \
				./src/NattyProtoClient.c \
		    	./ssl/openssl_aes_cfb.c \
		    	./ssl/openssl_aes_core.c \
		    	./ssl/openssl_cbc_enc.c \
		    	./ssl/openssl_cfb128.c \
		    	./ssl/openssl_des_enc.c \
		    	./ssl/openssl_md5.c \
		    	./ssl/openssl_set_key.c \
		    	./ssl/openssl_sha1.c
		    



LOCAL_LDLIBS	 += -pthread -llog

include $(BUILD_SHARED_LIBRARY)
