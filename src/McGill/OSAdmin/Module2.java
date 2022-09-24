package McGill.OSAdmin;
/* This is Module 2 for OS Admin*/

import McGill.Module;
import McGill.Question;

public class Module2 extends Module {
    public Module2() {
        module_title = "Module 2 - Processes and Process Management";
        module_objective = "The objective of this module is to explore how processes are handled and managed by the CPU.";

        new Question("What is term for the type of computer program that is being executed by a single or many threads in computing?",
                "Process",
                "A process is a type of computer program that is being executed by a single or many threads in computing. In it, you’ll find the program code and its activities. \nA process may be executed in multiple threads simultaneously depending on the operating system (OS).\n",
                "https://thesassway.com/what-is-a-process-in-computer-science/\n");

        new Question("What concept implies a system can perform more than one task simultaneously?",
                "Parallelism",
                "Parallel processing is a method of simultaneously breaking up and running program tasks on multiple microprocessors in order speed up performance time.\n Parallel processing allows individuals -- as well as network and data center managers -- to use ordinary desktop and laptop computers to solve complex problems that once required the assistance of a powerful supercomputer.\n",
                "https://www.techopedia.com/definition/3328/bootstrap\n");

        new Question("True or False | Most modern applications are multithreaded.",
                "true",
                "Most programs are now highly concurrent and/or parallel and so all the issues surrounding concurrency and parallelism are issues that affect most programs.\n So I guess most programs are multi-threaded, just in different ways.\n",
                "https://www.quora.com/Are-most-modern-applications-multi-threaded?share=1\n");

        new Question("True or False | Processing Scheduling is also called Job Scheduling.",
                "True",
                "While the terms are somewhat vague, there is a generally accepted usage of the words in question.\n",
                "https://stackoverflow.com/questions/50198853/what-is-the-difference-between-job-scheduling-and-process-scheduling\n");

        new Question("Which hardware component does Process Scheduling help maximize?",
                "CPU", "Job scheduling is the process of allocating system resources to many different tasks by an operating system (OS). \nThe system handles prioritized job queues that are awaiting CPU time and it should determine which job to be taken from which queue and the amount of time to be allocated for the job. This type of scheduling makes sure that all jobs are carried out fairly and on time.\n",
                "https://www.techopedia.com/definition/7882/job-scheduling\n");

        new Question("Parent process create children processes, which, in turn create other processes, forming a tree of processes. \nHow do you call the parent process when it isn't waiting?",
                "Zombie", "If no parent waiting, process is a zombie.\nIf parent terminated, process is an orphan.\n",
                "");

        new Question("What Multiprocessor Architecture has Master/Slave relationship?",
                "Asymmetric",
                "In asymmetric systems, each processor is given a predefined task. There is a master processor that gives instruction to all the other processors.\n Asymmetric multiprocessor system contains a master slave relationship. Asymmetric multiprocessor was the only type of multiprocessor available before symmetric multiprocessors were created. Now also, this is the cheaper option.\n",
                "https://www.tutorialspoint.com/Multiprocessor-Systems");




        Module_Grade();
    }


}
