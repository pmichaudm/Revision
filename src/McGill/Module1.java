package McGill;
/* This is Module 1 for OS Admin*/

public class Module1 extends Module {
    Module1() {
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
                "https://www.techopedia.com/definition/2162/bus");
        new Question("Which of the following is not something an OS would normally manage? \n Printing \n Network Access \n Memory access \n CPU cache \n The file system",
                "cpu cache", "Central processing unit cache (CPU cache) is a type of cache memory that a computer processor uses to access data and programs much more quickly than through host memory or random access memory (RAM).\nIt enables storing and providing access to frequently used programs and data.\n" +
                "\n" +
                "CPU cache is also known as processor cache.",
                "https://www.techopedia.com/definition/6659/central-processing-unit-cache-cpu-cache");

        Module_Grade();
    }


}
