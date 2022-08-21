package com.yxj.jcuda;

import jcuda.runtime.JCuda;
import jcuda.runtime.cudaDeviceProp;

public class JCUDATest {
    public static void main(String[] args) {
        cudaDeviceProp cudaDeviceProp = new cudaDeviceProp();
        int i = JCuda.cudaGetDeviceProperties(cudaDeviceProp, 0);

        System.out.println("设备名称与型号: "+new String(cudaDeviceProp.name) );
        System.out.println("显存大小: "+(int)(cudaDeviceProp.totalGlobalMem / 1024 / 1024)+" MB" );
        System.out.println("含有的SM数量: "+cudaDeviceProp.multiProcessorCount );
        System.out.println("CUDA CORE数量: "+cudaDeviceProp.multiProcessorCount * 192 );
        System.out.println("计算能力: "+cudaDeviceProp.major+"."+cudaDeviceProp.minor );
        System.out.println("是否开启ECC支持："+cudaDeviceProp.ECCEnabled);
        int[] deviceCount = new int[1];
        JCuda.cudaGetDeviceCount(deviceCount);
        System.out.println(deviceCount[0]);

//        JCuda.cudaMemcpy()



    }
}
