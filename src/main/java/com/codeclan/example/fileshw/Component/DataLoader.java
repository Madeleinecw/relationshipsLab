package com.codeclan.example.fileshw.Component;

import com.codeclan.example.fileshw.Models.File;
import com.codeclan.example.fileshw.Models.Folder;
import com.codeclan.example.fileshw.Models.User;
import com.codeclan.example.fileshw.Repositories.FileRepository;
import com.codeclan.example.fileshw.Repositories.FolderRepository;
import com.codeclan.example.fileshw.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        User maddie = new User("Maddie");
        userRepository.save(maddie);

        User cyril = new User("Cyril");
        userRepository.save(cyril);

        User linsey = new User("Linsey");
        userRepository.save(linsey);

        User david = new User("David");
        userRepository.save(david);

        Folder schoolwork = new Folder("Schoolwork", maddie);
        folderRepository.save(schoolwork);

        Folder planning = new Folder("Planning", cyril);
        folderRepository.save(planning);

        Folder organisation = new Folder("organisation", linsey);
        folderRepository.save(organisation);

        Folder work = new Folder("Work", david);
        folderRepository.save(work);

        File spring = new File("Spring", "java", 2, schoolwork);
        fileRepository.save(spring);

        File text = new File("text", "txt", 3, work);
        fileRepository.save(text);

        File plans = new File("plans", "txt", 1, planning);
        fileRepository.save(plans);

        File charts = new File("charts", "odf", 2, organisation);
        fileRepository.save(charts);

        planning.addFile(plans);
        organisation.addFile(charts);
        schoolwork.addFile(spring);
        work.addFile(text);



    }

}
