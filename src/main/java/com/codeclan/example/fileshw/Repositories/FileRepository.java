package com.codeclan.example.fileshw.Repositories;

import com.codeclan.example.fileshw.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
