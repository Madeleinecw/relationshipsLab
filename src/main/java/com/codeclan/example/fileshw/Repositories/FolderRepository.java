package com.codeclan.example.fileshw.Repositories;

import com.codeclan.example.fileshw.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
