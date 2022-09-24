package McGill.OSAdmin;
/* This is Module 1 for OS Admin*/

import McGill.Module;
import McGill.Question;

public class Module1 extends Module {
    public Module1() {
        module_title = "Introduction to: Operating system administration";
        module_objective = "The objective of this module is to introduce basic concepts of operating systems.";

        new Question("What is the program running at all times on the computer?",
                "Kernel",
                "The kernel is a computer program at the core of a computer's operating system and generally has complete control over everything in the system.\n It is the portion of the operating system code that is always resident in memory, and facilitates interactions between hardware and software components.\n",
                "https://www.techopedia.com/definition/3277/kernel\n");
        new Question("What is the program that initializes the OS during startup or reboot?",
                "Bootstrap",
                "Bootstrapping is the process of loading a set of instructions when a computer is first turned on or booted.\n The entire operating system depends on the bootstrap program to work correctly as it loads the operating system.\n",
                "https://www.techopedia.com/definition/3328/bootstrap\n");
        new Question("True or False | Cache is used to increase the speed of data access",
                "True",
                "Cache memory is a small-sized type of volatile computer memory that provides high-speed data access to a processor and \nstores frequently used computer programs, applications and data. A temporary storage of memory, cache makes data retrieving easier and more efficient.\n It is the fastest memory in a computer, and is typically integrated onto the motherboard and directly embedded in the processor or main random access memory (RAM)\n",
                "https://www.techopedia.com/definition/6307/cache-memory\n");
        new Question("Where is the Bootstrap stored?",
                "Firmware", "Bootstrap is typically stored in firmware. The firmware is a software program or set of instructions programmed on a hardware device.\n\nIt provides the necessary instructions for how the device communicates with the other computer hardware.\n",
                "https://www.techopedia.com/definition/2137/firmware\n");
        new Question("What do we call the service that interconnects things such as memory, CPU, disks, etc.. within a computer?",
                "bus", "A bus is a subsystem that is used to connect computer components and transfer data between them. \nFor example, an internal bus connects computer internals to the motherboard.",
                "https://www.techopedia.com/definition/2162/bus\n");
        new Question("Which of the following is not something an OS would normally manage? \n Printing \n Network Access \n Memory access \n CPU cache \n The file system",
                "cpu cache", "Central processing unit cache (CPU cache) is a type of cache memory that a computer processor uses to access data and programs much more quickly than through host memory or random access memory (RAM).\nIt enables storing and providing access to frequently used programs and data.\n" +
                "\n" +
                "CPU cache is also known as processor cache.",
                "https://www.techopedia.com/definition/6659/central-processing-unit-cache-cpu-cache");
        new Question("SSDs hard drives are faster than magnetic hard drives. Why are magnetic hard drives still being sold today?"
                + "\n[1] They are less expensive" + "\n[2] They work better for applications such as media streaming" + "\n[3] They are more compatible with older systems" +
                "\n[4] All of these are correct" + "\n\n Please answer with a number!","1",
                "A magnetic disk is a storage device that uses a magnetization process to write, rewrite and access data. \nIt is covered with a magnetic coating and stores data in the form of tracks, spots and sectors. \n They are less expensive and provide decent storage for files that don't need heavy usage.",
                "https://www.techopedia.com/definition/8210/magnetic-disk\n");
        new Question("Why does the computer's bootstrap program not reside in primary memory?" +
                "\n[1] The cache from primary memory would interfere with it " + "\n [2] It would make memory unavailable to other application" +
                "\n [3] Because primary memory is volatile" + "\n [4] Primary memory is too slow" + "\n [5] None of these are correct" + "\n\n Please answer with a number!",
                "3", "Primary memory is computer memory that a processor or computer accesses first or directly. \nIt allows a processor to access running execution applications and services that are temporarily stored in a specific memory location.",
                "https://www.techopedia.com/definition/1104/primary-memory\n");
        Module_Grade();
    }


}
