package vbyrgazov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vbyrgazov.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
