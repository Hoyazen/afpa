
// TODO import du module CSS propre à ce composant
// Plus d'informations sur le CSS modulaire : https://create-react-app.dev/docs/adding-a-css-modules-stylesheet/
import styles from './UserCard.module.css'; // Import css modules stylesheet as styles

export const UserCard = ({ user }) => {

    return (
        <ul className={styles.userCard}>
            <li>{user.name}</li>
            <li>{user.email}</li>
            <li>{user.phone}</li>
            <li>{user.company.name}</li>
        </ul>
    )
}
